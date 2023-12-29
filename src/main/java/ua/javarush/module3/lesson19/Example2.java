package ua.javarush.module3.lesson19;

import java.util.ArrayList;
import java.util.Iterator;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        Iterator<Object> iterator = objects.iterator();
        objects.add(new Object[10]);

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
    }
}
