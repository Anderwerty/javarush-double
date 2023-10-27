package ua.javarush.module2.project.example2.service;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class PropertyReader {
    public static void main(String[] args) {
        new PropertyReader().readProperties("abc");
    }

    public Map<String, Integer> readProperties(String filename) {
        ResourceBundle bundle = ResourceBundle.getBundle(filename);

        Enumeration<String> keys = bundle.getKeys();


        Map<String, Integer> propertyNameToValue = new HashMap<>();
        while (keys.hasMoreElements()){
            String key = keys.nextElement();
            Integer value = Integer.valueOf(bundle.getString(key));

            propertyNameToValue.put(key, value);
        }
        return propertyNameToValue;
    }
}
