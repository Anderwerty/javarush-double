package ua.javarush.module3.lesson10.restapiclient;

import java.util.List;

public interface GoRestClient {

    List<User> findAllUsers(Page page);

    User createNewUser(User user);
}
