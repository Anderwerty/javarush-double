package ua.javarush.module1.lesson11;

public class Example8 {
    public static void main(String[] args) {
        String text ="123456";

        String result1 = new StringBuilder(text).reverse().toString();
        System.out.println(result1);

        char[] chars = text.toCharArray();
        //???
    }



    private static String reverseString(String text){
        // put here your implementation

        return null;
    }
}
