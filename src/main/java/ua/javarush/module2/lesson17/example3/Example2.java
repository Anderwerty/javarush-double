package ua.javarush.module2.lesson17.example3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example2 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<MyClass> aClass = MyClass.class;
        Constructor<MyClass> constructorWithoutParameters = aClass.getDeclaredConstructor();
        constructorWithoutParameters.setAccessible(true);
        MyClass myClass = constructorWithoutParameters.newInstance();

        Constructor<MyClass> constructorWithParameters = aClass.getDeclaredConstructor(int.class);
        constructorWithParameters.setAccessible(true);
        MyClass myClass1 = constructorWithParameters.newInstance(100);
        System.out.println(myClass1.getValue());

        Method getValueMethod = aClass.getDeclaredMethod("getValue");
        getValueMethod.setAccessible(true);
        Integer invoke =(Integer) getValueMethod.invoke(myClass1);
        System.out.println(invoke);

        Method getStaticValueMethod = aClass.getDeclaredMethod("getStaticValue");
        getStaticValueMethod.setAccessible(true);
        Integer invoke1 =(Integer) getStaticValueMethod.invoke(null);
        System.out.println(invoke1);

    }
}

class MyClass {
    private static int staticValue = 1_000_000;
    public int value;

    public MyClass() {
        System.out.println("Constructor without parameters");
    }

    private MyClass(int value) {
        System.out.println("Constructor with parameters");
        this.value = value;
    }

    protected int getValue() {
        return value;
    }

    private static int getStaticValue(){
        return staticValue;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
