package ua.javarush.module1.lessoon10;

public class Example4 {

    private static final String DELIMITER = "=".repeat(20);

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Ukraine");

        System.out.println(DELIMITER);
        System.out.println("Hello\nUkraine");

        System.out.println(DELIMITER);
        System.out.println("Hello\tUkraine");

        System.out.println(DELIMITER);
        System.out.println("Hello\bUkraine");
        System.out.println("Hello\b");

        System.out.println(DELIMITER);
        System.out.println("1\nHello\rUkraine");

        System.out.println(DELIMITER);
        System.out.println("1\nHello\fUkraine");

        System.out.println("\\n");

        System.out.println("\"");
        System.out.println("'");

        System.out.println("""
                Hello
                Ukraine
                !
                """);
    }
}
