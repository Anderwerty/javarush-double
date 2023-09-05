package ua.javarush.module2.lesson4.example11;

import java.util.HashMap;
import java.util.Map;

public class InMemoryPasswordStorage implements PasswordStorage {
    private final Map<String, String> usernameToPassword = new HashMap<>();

    @Override
    public String findByUsername(String username) {
        return usernameToPassword.get(username);
    }

    @Override
    public void save(String username, String password) {
//        usernameToPassword.put(username, password);
    }
}
