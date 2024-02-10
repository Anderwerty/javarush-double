package ua.javarush.module4.lesson8.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

//https://www.baeldung.com/java-connection-pooling
public class HikariConnectionPoolProvider implements ConnectionProvider {

    private final HikariDataSource hikariDataSource;

    public HikariConnectionPoolProvider(String url, String user, String password) {
        final HikariConfig config = new HikariConfig();
        config.setJdbcUrl(url);
        config.setUsername(user);
        config.setPassword(password);
//        config.addDataSourceProperty("preStmtCacheSize", 256);

        hikariDataSource = new HikariDataSource(config);
    }

    @Override
    public Connection provideConnection() throws SQLException {
        return hikariDataSource.getConnection();
    }
}
