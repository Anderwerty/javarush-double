package ua.javarush.module2.project.example4;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class Example2 {
    public static void main(String[] args) {

    }
}

class Animal2{
    private final UnitSettings unitSettings;
    private int healthPoints;

    Animal2(UnitSettings unitSettings) {
        this.unitSettings = unitSettings;
    }
}

class Wolf2 extends Animal2{

    Wolf2() {
        super(UnitSettings.getByClass(Wolf2.class));
    }
}
//

enum EnumUnitSettings{
    WolfUnitSettings("wolf-settings"),
    CatUnitSettings("cat-settings");

    private final int weight;

    private final int maxNumber;
    private final int speed;

    private final int kg;

    EnumUnitSettings(String filename) {
        Map<String, Integer> properties = getProperties(filename);
        int weight = properties.get("weight");
        int maxNumber = properties.get("maxnumber");
        int speed = properties.get("speed");
        int kg = properties.get("kg");
        this.weight = weight;
        this.maxNumber = maxNumber;
        this.speed = speed;
        this.kg = kg;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public int getKg() {
        return kg;
    }

    private static Map<String, Integer> getProperties(String propertyFilename) {
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
class UnitSettings{
    
    private static final Map<Class<?>, UnitSettings> classToUnitSettings = new HashMap<>();
    static {
        classToUnitSettings.put(Wolf2.class, getUnitSettings("wolf-settings"));
    }


    public static UnitSettings getByClass(Class<?> aClass){
        return classToUnitSettings.get(aClass);
    }

    private final int weight;

    private final int maxNumber;
    private final int speed;

    private final int kg;

    private UnitSettings(int weight, int maxNumber, int speed, int kg) {
        this.weight = weight;
        this.maxNumber = maxNumber;
        this.speed = speed;
        this.kg = kg;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public int getKg() {
        return kg;
    }

    private static Map<String, Integer> getProperties(String propertyFilename) {
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

    private static UnitSettings getUnitSettings(String filename) {
        Map<String, Integer> properties = getProperties(filename);
        int weight = properties.get("weight");
        int maxNumber = properties.get("maxnumber");
        int speed = properties.get("speed");
        int kg = properties.get("kg");
        UnitSettings unitSettings = new UnitSettings(weight, maxNumber, speed, kg);
        return unitSettings;
    }




}
