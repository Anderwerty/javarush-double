package ua.javarush.module1.lesson4;

public class Example7 {

    // 18 - 26 or >=100 ( but not 115)
    public static void main(String[] args) {
        int age = 102;
        boolean isFree = (age >= 100 && 115 != age) || (age >= 18 && age <= 26);
//        boolean isNotFree = !isFree;
        boolean isNotFree = !((age >= 100 && 115 != age) || (age >= 18 && age <= 26));

        System.out.println(isFree);
        System.out.println(isNotFree);
    }
}
