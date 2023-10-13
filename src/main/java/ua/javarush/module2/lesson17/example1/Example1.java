package ua.javarush.module2.lesson17.example1;

public class Example1 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        MyClass myClass = new MyClass();
        System.out.println(myClass.getValue());
        MyClass myClass1 = MyClass.class.newInstance();
        System.out.println(myClass1.getValue());

        Class<MyClass> myClassClass = MyClass.class;
        Class<? extends MyClass> aClass = myClass.getClass();

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
