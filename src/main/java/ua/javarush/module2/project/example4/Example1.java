package ua.javarush.module2.project.example4;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class Example1 {
    public static void main(String[] args) {

    }
}

class Animal {
    protected Map<String, Integer> victimToProbobility;

    protected final int weight;
    protected final int maxNumber;
    protected final int speed;
    protected final int kg;


    public Animal(String propertyFilename, String settingFilename) {
        this.victimToProbobility = getProperties(propertyFilename);
        Map<String, Integer> properties = getProperties(settingFilename);
        this.weight = properties.get("weight");
        this.maxNumber = properties.get("maxnumber");
        this.speed = properties.get("speed");
        this.kg = properties.get("kg");
    }

    protected static Map<String, Integer> getProperties(String propertyFilename) {
        ResourceBundle bundle = ResourceBundle.getBundle(propertyFilename);

        Enumeration<String> keys = bundle.getKeys();


        Map<String, Integer> propertyNameToValue = new HashMap<>();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            Integer value = Integer.valueOf(bundle.getString(key));

            propertyNameToValue.put(key, value);
        }
        return propertyNameToValue;
    }
}

class Wolf extends Animal {
    public Wolf() {
        super("wolf", "wolf-settings");
    }


}
