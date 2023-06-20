package ua.javarush.module1.lesson11;

public class Example6 {

    public static void main(String[] args) {
        String result = "";
        StringBuilder builder = new StringBuilder();

        for (String arg : args) {
            result = result.concat(arg);  // "Hello"+"my"
            builder.append(arg);
//            result = result+"";
        }


        System.out.println(result);
        System.out.println(builder.toString());
    }
}
