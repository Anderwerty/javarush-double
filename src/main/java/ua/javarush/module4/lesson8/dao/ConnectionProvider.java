package ua.javarush.module4.lesson8.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionProvider {

    Connection provideConnection() throws SQLException;
}
