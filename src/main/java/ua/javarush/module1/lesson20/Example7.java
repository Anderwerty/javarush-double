package ua.javarush.module1.lesson20;

public class Example7 {
    public static void main(String[] args) {
        String a = null;//
        a = (a == null) ? "" : a;

        switch (a) {
            case "1":
                System.out.println("One");
                break;
            default:
                System.out.println("???");
        }
    }
}

