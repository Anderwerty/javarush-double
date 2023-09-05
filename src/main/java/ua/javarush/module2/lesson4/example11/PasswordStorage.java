package ua.javarush.module2.lesson4.example11;

public interface PasswordStorage {

    String findByUsername(String username);

    void save(String username, String password);
}
