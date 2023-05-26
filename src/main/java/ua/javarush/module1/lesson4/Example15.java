package ua.javarush.module1.lesson4;

public class Example15 {
    public static void main(String[] args) {
        int age = 23;
        int money;

        // step 0
        if (age > 50) {
            money = 100;
        } else {
            money = 75;
        }

        // step 1
        if (age > 50)
            money = 100;
        else
            money = 75;

        // step 2

        if (age > 50) money = 100;else money = 75;

        // step 3

       // money = if(age>50) 100 else 75;

        money = age>50 ? 100 : 75;
    }
}
