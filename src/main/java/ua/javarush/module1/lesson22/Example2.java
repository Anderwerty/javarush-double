package ua.javarush.module1.lesson22;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        var user = new User("Alex", 21, "email&gmail.com");

        try {
            validateUser(user);
        } catch (IllegalArgumentException e) {
            System.out.println("user is null");
        } catch (AgeLimitationRuntimeException e) {
            System.out.println("age should be >=18");
        } catch (EmailRuntimeException e) {
            System.out.println("wrong format of email");
        }

        System.out.println("=".repeat(100));

        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(Arrays.toString(stackTrace));
        System.out.println("=".repeat(100));

        try {
            validateUser2(user);
        } catch (IllegalArgumentException e){
            String message = e.getMessage();
            if(message!=null&& message.equals("user is null")){
                System.out.println("user is null");
            }
            //....
        }
    }

    // validation login on exception type
    private static void validateUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException();
        }
        if (user.getAge() < 18) {
            throw new AgeLimitationRuntimeException();
        }
        if (!user.getEmail().contains("@")) {
            throw new EmailRuntimeException();
        }
        //...
    }

    private static void validateUser2(User user) {
        if (user == null) {
            throw new IllegalArgumentException("Object is null");
        }
        if (user.getAge() < 18) {
            throw new IllegalArgumentException("Wrong value of age:[" + user.getAge() + "]");
        }
        if (!user.getEmail().contains("@")) {
            throw new IllegalArgumentException("Wrong format for email");
        }
        //...
    }
}


class User {
    private final String name;
    private final int age;
    private final String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}

class AgeLimitationRuntimeException extends RuntimeException {

}

class EmailRuntimeException extends RuntimeException {

}

class UserValidationRuntimeException extends RuntimeException{
    private final ValidationStatus status;

    UserValidationRuntimeException(ValidationStatus status) {
        this.status = status;
    }
}

enum ValidationStatus{
    EMAIL, AGE;
}
