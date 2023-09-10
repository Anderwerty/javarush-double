package ua.javarush.module2.lesson5;

import java.util.List;

public class Example5 {
    public static void main(String[] args) {

        List<MyClass> list = null;
        doSomething(list);

        //1) Object ---> A ---- > B -----> C ----->D---->E
        // ? super C

        //2)  Object ---> A ---- > B -----> C ----->D---->E
        // ? extends C
    }

    public static void doSomething(List<? super MyClass> list) {
        list.add(new MyClass());
        list.add(new AMyClass());

    }
}

class MyClass {

}

class AMyClass extends MyClass {

}

class BMyClass extends  AMyClass {

}
