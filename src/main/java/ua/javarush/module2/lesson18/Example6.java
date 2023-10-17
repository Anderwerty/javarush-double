package ua.javarush.module2.lesson18;

public class Example6 {

    @SuppressWarnings({"unchecked", "cast", "java:S1854", "java:S1481"})
    public static void main(String[] args) {
        Object ob = "String";
        String str = (String) ob;
        System.out.println("file");
    }
}

class ConsoleView {
    @SuppressWarnings("java:S106")
    public void printIntoConsole(String message) {
        System.out.println(message);
    }
}
