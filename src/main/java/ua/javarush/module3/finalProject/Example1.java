package ua.javarush.module3.finalProject;

import java.util.Locale;
import java.util.ResourceBundle;

public class Example1 {
    public static void main(String[] args) {
        Locale locale = new Locale("ua", "UA");
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        System.out.println(bundle.getString("title"));
    }
}
