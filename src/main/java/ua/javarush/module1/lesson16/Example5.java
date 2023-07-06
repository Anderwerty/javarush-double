package ua.javarush.module1.lesson16;

public class Example5 {
    public static void main(String[] args) {
        Boolean a = true;
        Boolean b = true;
        Boolean c = new Boolean(true);

//        Boolean.valueOf(true)

        System.out.println(a == b);
        System.out.println(a == c);
    }
}
