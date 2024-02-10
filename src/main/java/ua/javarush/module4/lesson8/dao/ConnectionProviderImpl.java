package ua.javarush.module4.lesson8.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProviderImpl implements ConnectionProvider {
    private final String url;
    private final String user;
    private final String password;


    public ConnectionProviderImpl(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public Connection provideConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
