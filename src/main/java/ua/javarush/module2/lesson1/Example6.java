package ua.javarush.module2.lesson1;

public class Example6 {

    public static void main(String[] args) {

    }

    public static void method(){
        for (int i = 0; i <10 ; i++) {
            innerPrivateMethod();
        }
    }

    private static void innerPrivateMethod() {
//        for (int j = 1; j <=100 ; j++) {
//            System.out.println("*****");
//        }

        for (int j = 1; j <=50 ; j++) {
            System.out.println("*****");
        }

        for (int j = 51; j <=100 ; j++) {
            System.out.println("*****");
        }
    }
}
