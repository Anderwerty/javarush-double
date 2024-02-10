package ua.javarush.module4.lesson8;

import ua.javarush.module4.lesson8.dao.ConnectionProvider;
import ua.javarush.module4.lesson8.dao.ConnectionProviderImpl;
import ua.javarush.module4.lesson8.dao.CustomerSQLDao;
import ua.javarush.module4.lesson8.dao.HikariConnectionPoolProvider;

import java.sql.SQLException;

public class Example1 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/javarush";
        String user = "root";
        String password = "password";
//        ConnectionProvider connectionProvider = new ConnectionProviderImpl(url, user, password);
        ConnectionProvider connectionProvider = new HikariConnectionPoolProvider(url, user, password);
        CustomerSQLDao customerSQLDao = new CustomerSQLDao(connectionProvider);
        //        String query = "SELECT * FROM customers WHERE id=" + id;
        //Customer(id=10, name=Jack, sex=male, email=jackemail@gmail.com, telephone=442345678, address=London)
        System.out.println(customerSQLDao.findById("0 OR 10>2").orElse(null));
        System.out.println("======================");
        System.out.println(customerSQLDao.findById("13").orElse(null));

    }
}
