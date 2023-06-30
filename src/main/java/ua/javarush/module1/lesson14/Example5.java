package ua.javarush.module1.lesson14;

public class Example5 {
    public static void main(String[] args) {
        new MyClass().nonStaticVoidMethod();
        MyClass.staticVoidMethod();
    }
}

class MyClass {
    private static int staticValue;
    private static MyClass myClass = new MyClass();

    private int nonStaticValue;


    public static void staticVoidMethod() {
        System.out.println(staticValue);
        System.out.println(myClass.nonStaticValue); // `this` cannot be used here
//        myClass.nonStaticVoidMethod(); // `this` cannot be used here

        staticVoidMethod2();
    }

    private static void staticVoidMethod2(){

    }

    public void nonStaticVoidMethod() {
        System.out.println(staticValue);
        System.out.println(nonStaticValue);
        staticVoidMethod();
        int nonStaticValue = getNonStaticValue();
    }

    public void setNonStaticValue(int nonStaticValue) {
        this.nonStaticValue = nonStaticValue;
    }

    public int getNonStaticValue() {
        return nonStaticValue;
    }

    public static void setStaticValue(int staticValue) {
        MyClass.staticValue = staticValue;
    }
}
