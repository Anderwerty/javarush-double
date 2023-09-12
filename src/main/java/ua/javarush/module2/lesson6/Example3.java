package ua.javarush.module2.lesson6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User(20), new User(21),
                new User(20), new User(5), new User(15)
        );

        Collections.sort(users, (o1, o2) -> o1.getAge() - o2.getAge());

        System.out.println(users);

        Comparable<User> comparable = (that) ->{
            return 0;
        };
    }
}

class User implements Comparable<User> {

    private int age;

    private String name;

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // this > that  return >0
    // this < that return <0
    // this == that return 0;
    @Override
    public int compareTo(User that) {

        // if(this.age> that.age){ return 1} ....
        return this.age - that.age;
    }


    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}


class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getAge() - o2.getAge();
    }
}
