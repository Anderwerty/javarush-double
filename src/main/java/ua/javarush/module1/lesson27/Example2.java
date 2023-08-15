package ua.javarush.module1.lesson27;

public class Example2 {
    public static void main(String[] args) {
        long ms = Long.MAX_VALUE;
        long s = ms /1000;
        long min = s /60;
        long hours= min /60;
        long days = hours/24;
        long years = days/365;
        System.out.println(years);
    }
}
