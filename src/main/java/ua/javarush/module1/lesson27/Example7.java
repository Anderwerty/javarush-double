package ua.javarush.module1.lesson27;

import java.time.LocalDate;
import java.util.ArrayList;

public class Example7 {
    public static void main(String[] args) {

        String str = "1";
        str = str.concat("2");

        System.out.println(str);



        LocalDate now = LocalDate.now();
        now = now.plusMonths(10);
    }
}

