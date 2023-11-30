package ua.javarush.module3.lesson10;

import ua.javarush.module3.lesson10.restapiclient.GoRestClient;
import ua.javarush.module3.lesson10.restapiclient.GoRestClientImpl;
import ua.javarush.module3.lesson10.restapiclient.GoRestRuntimeException;
import ua.javarush.module3.lesson10.restapiclient.Page;
import ua.javarush.module3.lesson10.restapiclient.User;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class FindAllUsersExample {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        try {
            GoRestClient goRestClient = new GoRestClientImpl();


            System.out.println("find all users");

            List<User> users = goRestClient.findAllUsers(new Page(1, 2));
            System.out.println("=".repeat(100));

            users.forEach(user -> {
                System.out.println(user);
                System.out.println();
            });
            System.out.println("=".repeat(100));
        } catch (GoRestRuntimeException e) {
            System.out.println(e);
        }

    }
}


