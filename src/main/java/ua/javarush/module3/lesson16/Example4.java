package ua.javarush.module3.lesson16;

public class Example4 {
}


class Facade{
    private Service1 service1;
    private Service2 service2;

    public void method1(String message){
        service1.method1();
        service2.method2();
    }
}

class Service1 {
    void method1(){
        /*






         */
    }
}

class Service2{
    void method2(){

    }
}
