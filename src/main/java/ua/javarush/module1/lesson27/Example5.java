package ua.javarush.module1.lesson27;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example5 {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yy/MM/dd");

        System.out.println(simpleDateFormat.format(date));

    }
}
