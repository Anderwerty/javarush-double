package ua.javarush.module2.lesson18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Example4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User alex = new User(10, "Alex");
        User clone = (User)alex.clone();
        System.out.println(clone);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyCloneable{

}

// @MyCloneable (Reflection API) vs Cloneable(instanceof)
@MyCloneable
class User implements Cloneable {
    private final int age;
    private final String name;

    User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
