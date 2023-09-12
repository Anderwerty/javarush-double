package ua.javarush.module2.lesson6;

public class Example4 {
    public static void main(String[] args) {
        MyInterface21 instance1 =
                (message, times) -> Example4.printMessage(message, times);

        MyInterface21 instance2 = Example4::printMessage; //
        MyInterface21 instance3 = new Example4()::printNotStaticMessage;
//        MyInterface21 instance4 = Example4::print;  // does not work!

        instance1.method("Hello Denys", 2);
        System.out.println("=".repeat(100));
        instance2.method("Hello Letu", 2);
        System.out.println("=".repeat(100));
        instance3.method("Hello Marina", 2);



    }

    public static void print(int times, String message){
        printMessage(message, times);
    }

    public void printNotStaticMessage(String message, int times) {
        System.out.println(".............");
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
        System.out.println("...........");
    }


    public static void printMessage(String message, int times) {
        System.out.println(".............");
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
        System.out.println("...........");
    }
}

interface MyInterface21 {
    void method(String message, int times);
}
