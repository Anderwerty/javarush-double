package ua.javarush.module1.lesson23;

public class Example7 {
    public static void main(String[] args) {
        String name = "Hi";
        var result = switch (name) {

            case "Hi" -> {
                yield "greeting";
            }
            case "hello" -> {
                yield  10;
            }
            default -> throw new RuntimeException();
        };

        System.out.println(result.getClass());

        Object v = result;
    }
}
