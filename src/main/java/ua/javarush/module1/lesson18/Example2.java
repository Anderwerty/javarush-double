package ua.javarush.module1.lesson18;

import java.util.HashMap;

public class Example2 {
    public static void main(String[] args) {
        HashMap<A, Integer> map = new HashMap<>();

        A key1 = new A(1);
        A key2 = new A(2);
        map.put(key1, 1);
        map.put(null, 2);
        map.put(key2, 100);

//        key1.setValue(12);


        Integer value1 = map.get(new A(12));
        System.out.println(value1);

        Integer value2 = map.get(new A(2));
        System.out.println(value2);
    }
}

// immutable
final class A {
    private final int value;

    public A(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        A a = (A) o;
        return value == a.value;
    }

    @Override
    public String toString() {
        return "A{" +
                "value=" + value +
                '}';
    }
}
