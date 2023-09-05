package ua.javarush.module2.lesson4.example11;

public class StupidPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword(String username) {
        return "******";
    }
}
