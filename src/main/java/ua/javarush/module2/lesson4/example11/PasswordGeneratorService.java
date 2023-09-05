package ua.javarush.module2.lesson4.example11;

// username ---> password
// username --->
public class PasswordGeneratorService {
    private final PasswordGenerator passwordGenerator;
    private final PasswordStorage passwordStorage;

    public PasswordGeneratorService(PasswordGenerator passwordGenerator, PasswordStorage passwordStorage) {
        this.passwordGenerator = passwordGenerator;
        this.passwordStorage = passwordStorage;
    }

    public String generatePassword(String username) {
        String passwordFromStorage = passwordStorage.findByUsername(username);
        if (passwordFromStorage != null) {
            return passwordFromStorage;
        } else {
            String generatedPassword = passwordGenerator.generatePassword(username);

            passwordStorage.save(username, generatedPassword);
            return generatedPassword;
        }
    }
}
