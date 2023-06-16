package ua.javarush.module1.lessoon10;

public class Example6 {
    public static void main(String[] args) {
        String message = "Hello!";
        String addresses="example@gmail.com,zsy@gmail.com,budano@gmail.com";

        System.out.println(message.length());
        System.out.println(message.isEmpty());
        System.out.println(message.isBlank());
        System.out.println(message.charAt(1));
        System.out.println(message.toCharArray());
        System.out.println(message.getBytes());

        String[] items = addresses.split(",");
        for (String address: items) {
            System.out.println("send to: " +address);
        }
    }
}
