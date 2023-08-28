package ua.javarush.module2.lesson1;

import java.time.LocalDate;

public class Example2 {
}

class User {
    String name;
    LocalDate birth;
}

class Client1 extends User {

}

class Admin extends User {

}

class Pet /*extends User*/ {
    String name;
    LocalDate birth;
}
