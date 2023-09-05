package ua.javarush.module2.lesson4.example11;

public class SimplePasswordGenerator implements PasswordGenerator {

    private static int counter = 0;

    @Override
    public String generatePassword(String username) {
        return "password" + (counter++);
    }
}
