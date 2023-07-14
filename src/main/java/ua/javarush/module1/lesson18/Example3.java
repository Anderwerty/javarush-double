package ua.javarush.module1.lesson18;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Example3 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new LinkedHashMap<>();

        map.put(100, 1);
        map.put(2, 2);
        map.put(300, 3);
        map.put(4, 4);
// set of nodes
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        System.out.println("=================");

        System.out.println(map);


    }
}
