package ua.javarush.module2.lesson18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Example7 {
    public static void main(String[] args) {

    }
}

@Settings(
        number = 100,
        voice = "mia-mia"
)
class Cat {

}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Settings {
    int number();
    String voice();

    String filename() default "";
}
