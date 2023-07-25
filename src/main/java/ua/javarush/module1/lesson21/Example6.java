package ua.javarush.module1.lesson21;

public class Example6 {
    public static void main(String[] args) {
        methodWithUncheckedException();

        System.out.println("=".repeat(50));

        try {
            methodWithCheckedException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void methodWithUncheckedException() /*throws RuntimeException*/ {
        throw new RuntimeException();
    }

    private static void methodWithCheckedException() throws Exception {
        throw new Exception();
    }

}
