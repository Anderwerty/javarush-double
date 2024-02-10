package ua.javarush.module4.lesson7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class CustomerDao {

    public void findById(int id) {
        String url = "jdbc:mysql://localhost:3306/javarush";
        String user = "root";
        String password = "password";

        String query = "SELECT id, email FROM customers WHERE id=" + id;

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            if (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("sex"));
                System.out.println(resultSet.getString("email"));
                System.out.println(resultSet.getInt("telephone"));
                System.out.println(resultSet.getString("address"));
//
//                Blob blob = resultSet.getBlob("");
//                Clob clob = resultSet.getClob("");
//                LocalDateTime registerDate = resultSet.getObject("register_date", LocalDateTime.class);


                ResultSetMetaData metaData = resultSet.getMetaData();

            }
        } catch (SQLException e) {
            throw new SQLRuntimeException(e);
        }
    }
}
