package ua.javarush.module1.lesson11;

public class Example3 {
    public static void main(String[] args) {
        String emails = "a@gmail.com,b@gmail.com,c@gmail.com";
        String[] addresses = emails.split(",");
        for (String address : addresses) {
            System.out.println(address);
        }


        String line = String.join(";", addresses);
        System.out.println(line);
    }
}
