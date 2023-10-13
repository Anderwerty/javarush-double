package ua.javarush.module2.lesson17.example2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example2 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<MyClass> aClass = MyClass.class;
       Constructor<?>[] constructors = aClass.getConstructors();
        Constructor<MyClass> constructorWithoutParameters = aClass.getConstructor();

        MyClass myClass = constructorWithoutParameters.newInstance();

//      MyClass.class.getConstructor().newInstance();

        Constructor<MyClass> constructorWithParameters = aClass.getConstructor(int.class);

        MyClass myClass1 = constructorWithParameters.newInstance(100);
        System.out.println(myClass1.getValue());

    }
}

class MyClass {
    public int value;

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
