package ua.javarush.module2.lesson4.example11;

public class Example11 {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new SimplePasswordGenerator();
        PasswordStorage passwordStorage = new InMemoryPasswordStorage();
        PasswordGeneratorService passwordGeneratorService =
                new PasswordGeneratorService(passwordGenerator, passwordStorage);

        String password1 = passwordGeneratorService.generatePassword("username");
        String password2 = passwordGeneratorService.generatePassword("username");

        System.out.println(password1);
        System.out.println(password2);


    }
}
