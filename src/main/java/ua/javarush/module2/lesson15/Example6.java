package ua.javarush.module2.lesson15;

public class Example6 {
    public static void main(String[] args) {
        AClass aClass = new AClass(2) {
            @Override
            public void printValue() {
                System.out.println("____________");
                super.printValue();
                System.out.println("____________");

            }
        };

        aClass.printValue();
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method1() {

            }

            @Override
            public void method2() {

            }
        };
    }
}

class AClass{

    private final int value;

    AClass(int value) {
        this.value = value;
    }


    public void printValue(){
        System.out.println(value);
    }
}

interface MyInterface{

    void method1();
    void method2();
}
