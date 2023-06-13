package ua.javarush.module1.lesson9;

public class Example5 {
    public static void main(String[] args) {
        String hi = "Hi";
        printMessage(hi);
        printMessage("Hello", 5);
        printMessage(5,"Privit");
        printMessage();
    }

    public static void printMessage(){
        System.out.println("...");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

//    public static void printMessage(String text) {
//        System.out.println(text);
//    }

    public static void printMessage(String message, int times) {
        for (int i = 1; i <= times; i++) {
            printMessage(message);
        }
    }

    public static void printMessage( int times, String message) {
        for (int i = 1; i <= times; i++) {
            printMessage(message);
        }
    }

}
