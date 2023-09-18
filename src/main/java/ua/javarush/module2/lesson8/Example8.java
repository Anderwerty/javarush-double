package ua.javarush.module2.lesson8;

public class Example8 {
    public static void main(String[] args) {
        method(true);
    }


    //
    public static void method(boolean isThrowing){
        if(isThrowing){
            throw  null;
        }
    }
}
