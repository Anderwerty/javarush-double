package ua.javarush.module1.lesson20;

public class Example8 {
    public static void main(String[] args) {
        T t = null;//

        switch (t) {
            case A:
                System.out.println("A");
                break;
            default:
                System.out.println("???");
        }
    }

    // java8 switch-case vs if-else-if ???

}

enum T{
    A,B;
}
