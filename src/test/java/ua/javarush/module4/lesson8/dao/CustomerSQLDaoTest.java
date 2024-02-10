package ua.javarush.module4.lesson8.dao;


import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import ua.javarush.module4.lesson8.SQLRuntimeException;
import ua.javarush.module4.lesson8.entity.Customer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerSQLDaoTest {

    //https://www.h2database.com/html/tutorial.html
    String url = "jdbc:h2:mem:test";
    String user = "sa";
    String password = "";

    ConnectionProvider connectionProvider = new ConnectionProviderImpl(url, user, password);
    CustomerDao customerDao = new CustomerSQLDao(connectionProvider);

    String createDBQuery = "CREATE TABLE customers(....);";

    String insertDataQuery = "INSERT ...";

    @Before
    public void init() throws SQLException, FileNotFoundException {
// option 1
//        try (Connection connection = connectionProvider.provideConnection();
//             Statement statement = connection.createStatement()) {
//            // add query if exist ... DROP
//            statement.execute(createDBQuery);// create DB
//            statement.execute(insertDataQuery);// create DB
//        }
//
//        // option 2
//        ScriptRunner scriptRunner = new ScriptRunner(connectionProvider.provideConnection());
//        scriptRunner.runScript(new FileReader(new File("schema.sql")));
//        scriptRunner.runScript(new FileReader(new File("data.sql")));
    }

    @Test
    public void findByIdShouldReturnExistingCustomer() {
        Customer customer = customerDao.findById("1").orElse(null);

        Assert.assertNotNull(customer);
        Assert.assertEquals(customer.getId().intValue(), 1);
        Assert.assertEquals(customer.getName(), "Alex");
        // other assertions
    }

    @Test
    public void findByIdShouldReturnEmptyResult() {
        Customer customer = customerDao.findById("100").orElse(null);

        Assert.assertNull(customer);
    }

    @Test(expected = SQLRuntimeException.class)
    public void findByIdShouldThrowException() throws SQLException {
        ConnectionProvider mockedConnectionProvider =
                Mockito.mock(ConnectionProvider.class);
        Connection mockedConnection = Mockito.mock(Connection.class);
        Mockito.when(mockedConnection.prepareStatement("SELECT * FROM customers WHERE id = ?"))
                .thenThrow(new SQLException());

        Mockito.when(mockedConnectionProvider.provideConnection()).thenReturn(mockedConnection);
        CustomerSQLDao customerSQLDao =
                new CustomerSQLDao(mockedConnectionProvider);

        customerSQLDao.findById("1");
    }

}