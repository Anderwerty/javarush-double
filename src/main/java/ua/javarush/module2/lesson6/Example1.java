package ua.javarush.module2.lesson6;

public class Example1 {
    public static void main(String[] args) {
        MyInterface1 instance = new MyInterface1() {
            int counter = 0;

            @Override
            public void method1() {

            }

            @Override
            public int count() {
                return ++counter;
            }

            public void method2() {

            }
        };

        MyInterface1 instance2 = new MyInterface1() {
            @Override
            public void method1() {

            }

            @Override
            public int count() {
                return 0;
            }

            public void method2() {

            }
        };


        Example1 example1 = new Example1() {

        };

        instance.count();
        instance.method1();
//        instance.method2();

        System.out.println(instance.getClass().getName());
        System.out.println(instance2.getClass().getName());
    }
}


interface MyInterface1 {
    void method1();

    int count();
}

class MyClass1 implements MyInterface1 {

    @Override
    public void method1() {

    }

    @Override
    public int count() {
        return 0;
    }
}
