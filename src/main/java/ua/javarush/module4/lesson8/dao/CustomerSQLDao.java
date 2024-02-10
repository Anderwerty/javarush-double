package ua.javarush.module4.lesson8.dao;

import ua.javarush.module4.lesson8.SQLRuntimeException;
import ua.javarush.module4.lesson8.entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.List;
import java.util.Optional;

public class CustomerSQLDao implements CustomerDao {
    private static final String FIND_BY_ID_QUERY = "SELECT * FROM customers WHERE id = ?";
    private final ConnectionProvider connectionProvider;

    public CustomerSQLDao(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }

    @Override
    public Optional<Customer> findById(String id) {
        try (Connection connection = connectionProvider.provideConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID_QUERY)) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            Customer customer = null;
            if (resultSet.next()) {

                customer = new Customer();
                customer.setId(resultSet.getInt("id"));
                customer.setName(resultSet.getString("name"));
                customer.setSex(resultSet.getString("sex"));
                customer.setEmail(resultSet.getString("email"));
                customer.setTelephone(resultSet.getInt("telephone"));
                customer.setAddress(resultSet.getString("address"));
            }
            return Optional.ofNullable(customer);
        } catch (SQLException e) {
            throw new SQLRuntimeException(e);
        }
    }

    @Override
    public Customer save(Customer customer) {
        String saveQuery = "insert into customers (id, name, sex, email, telephone, address) VALUES(?,?, ?,?,?,?)";
        try (Connection connection = connectionProvider.provideConnection();
             PreparedStatement ps = connection.prepareStatement(saveQuery)) {
            // UUID.randomUUID().toString()
            int id = 1;
            ps.setInt(1, id);
            ps.setString(2, customer.getName());
            //...

            customer.setId(id);
            connection.setAutoCommit(false);
            ///////////////
            try {
                ps.executeUpdate();
                ps.executeUpdate();
                Savepoint savepoint = connection.setSavepoint();


                connection.commit();
            } catch (Exception e){
                connection.rollback();
                connection.rollback(null);
            }

            connection.setAutoCommit(true);
            System.out.println();
            ////////////////////////

            return customer;
            //..
        } catch (SQLException e) {
            throw new SQLRuntimeException(e);
        }
    }

    @Override
    public List<Customer> saveAll(List<Customer> customers) {
        //return customers.stream().map(this::save).collect(Collectors.toList());

        String saveQuery = "insert into customers (id, name, sex, email, telephone, address) VALUES(?,?, ?,?,?,?)";
        try (Connection connection = connectionProvider.provideConnection();
             PreparedStatement ps = connection.prepareStatement(saveQuery)) {

            for (Customer customer : customers) {
                int id = 1;
                ps.setInt(1, id);
                ps.setString(2, customer.getName());
                //...

                customer.setId(id);
                ps.addBatch();
            }

            ps.executeBatch();

            return customers;
            //..
        } catch (SQLException e) {
            throw new SQLRuntimeException(e);
        }
    }
}
