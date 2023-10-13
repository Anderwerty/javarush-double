package ua.javarush.module2.lesson17.example4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Example4 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<MyClass> aClass = MyClass.class;

        Constructor<MyClass> constructorWithParameters = aClass.getConstructor(int.class);

        MyClass myClass1 = constructorWithParameters.newInstance(100);
        System.out.println(myClass1.getValue());

        Field valueField = aClass.getDeclaredField("value");
        valueField.setAccessible(true);
        valueField.setInt(myClass1, 123);
        System.out.println("=======================");

        System.out.println(myClass1.getValue());
        System.out.println(valueField.getInt(myClass1));


        Field staticValueField = aClass.getDeclaredField("staticValue");
        staticValueField.setAccessible(true);
        staticValueField.setInt(null, 123456);
        System.out.println(MyClass.staticValue);

    }
}

class MyClass {
    private int value;

    protected static int staticValue = 10000;

    public MyClass() {
        System.out.println("Constructor without parameters");
    }

    public MyClass(int value) {
        System.out.println("Constructor with parameters");
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
