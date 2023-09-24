package ua.javarush.module2.lesson9;

public class Example2 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println(o1);
        System.out.println(o2);

        //* hashCode default ?
        Object[] objects = {o1, o2, null, 2};
        System.out.println(objects);
    }
}
