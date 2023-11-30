package ua.javarush.module3.lesson10;

import com.google.gson.Gson;
import ua.javarush.module3.lesson10.restapiclient.GoRestClient;
import ua.javarush.module3.lesson10.restapiclient.GoRestClientImpl;
import ua.javarush.module3.lesson10.restapiclient.GoRestRuntimeException;
import ua.javarush.module3.lesson10.restapiclient.User;

public class CreateUserExample {
    public static void main(String[] args) {
        try {
            GoRestClient goRestClient = new GoRestClientImpl();

            System.out.println("create new user");

            User user = User.builder()
                    .withEmail("taras.shevchenko3@gmail.com") // it should unique
                    .withName("Taras Shevchenko")
                    .withStatus("active")
                    .withGender("male")
                    .build();

            User newUser = goRestClient.createNewUser(user);

            System.out.println("=".repeat(100));
            System.out.println(newUser);
            System.out.println("=".repeat(100));
        } catch (GoRestRuntimeException e) {
            System.out.println(e);
        }
    }
}
