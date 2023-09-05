package ua.javarush.module2.lesson4;

public class Example3 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        boolean isMarkeable = myClass instanceof Securable;

        System.out.println(isMarkeable);
        myClass.method();

    }
}

//maker interface
interface Securable {

}

class MyClass implements Securable {
    //. some fields and methods

    public void method(){

    }
}
