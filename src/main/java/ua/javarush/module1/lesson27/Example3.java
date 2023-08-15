package ua.javarush.module1.lesson27;

import java.util.Date;

public class Example3 {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date.getYear());
        System.out.println(date.getMonth());


        Date date1 = new Date(0);
        System.out.println(date1.getYear() +1900);


        Date date2 = new Date(2023 - 1900, 8, 14);
        System.out.println(date2);

        date2.setMonth(1);

        System.out.println(date2);

    }
}
