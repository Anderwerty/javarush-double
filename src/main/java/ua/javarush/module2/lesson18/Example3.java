package ua.javarush.module2.lesson18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Example3 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        UserService userService = new UserService();
        Method[] methods = UserService.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Security.class)) {
                System.out.println("Check use authority");
                Object invoke = method.invoke(userService);
            }
        }
    }
}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Security {
    String[] roles();
}

class UserService {

    @Security(roles = {"ADMIN", "MANAGER"})
    public void execute() {

    }
}
