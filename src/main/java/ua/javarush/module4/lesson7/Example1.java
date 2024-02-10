package ua.javarush.module4.lesson7;

import java.sql.SQLException;

public class Example1 {
    public static void main(String[] args) throws SQLException {
        CustomerDao customerDao = new CustomerDao();
        customerDao.findById(10);
        System.out.println("======================");
        customerDao.findById(13);

    }
}
