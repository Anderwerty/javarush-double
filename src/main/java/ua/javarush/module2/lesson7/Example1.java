package ua.javarush.module2.lesson7;

public class Example1 {
    public static void main(String[] args) {
        Object ob1 = "d";

        Object ob2 = 1;
        Object ob3 = new Object();
        Object ob4 = null;

        findTypeOFInstance(ob1);
        findTypeOFInstance(ob2);
        findTypeOFInstance(ob3);
        findTypeOFInstance(ob4);

        System.out.println("");

        Object int1 = 1;
        System.out.println(int1 instanceof String);

        // Option1
        if(int1 instanceof  Integer){
            Integer integer = (Integer) int1;
        }
        // Option2

        if(int1 instanceof Integer integer){
            System.out.println(integer);
        }

//        System.out.println((String) int1);

        System.out.println("=====================");
        String value1 = null;
        Object valueObject = value1;

        System.out.println((Number) valueObject);

    }


    public static void findTypeOFInstance(Object instance) {
        if (instance instanceof Integer) {
            System.out.println("Integer");
        } else if (instance instanceof String) {
            System.out.println("String");
        } else {
            System.out.println("We don't know this type");
        }
    }
}
