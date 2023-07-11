package ua.javarush.module1.lesson17;

import java.util.HashSet;
import java.util.Objects;

public class Example2 {
    public static void main(String[] args) {
        HashSet<A> objects = new HashSet<>();
        System.out.println("Is new hashSet empty " + objects.isEmpty());
        System.out.println("New hashSet size " + objects.size());
        System.out.println("-".repeat(35));
        System.out.println(objects.add(new A(1)));
        System.out.println(objects.add(new A(1))); // duplicate (class has equals method)
        System.out.println(objects.add(new A(3)));
        System.out.println("-".repeat(35));


        System.out.println("size of hashSet " + objects.size());

        System.out.println("Contains A(1): " + objects.contains(new A(1)));

        boolean isRemoved = objects.remove(new A(1));

        System.out.println("Is A(1) removed: " + isRemoved);

        System.out.println("Size after removal: " + objects.size());

        boolean isRemovedOneMoreTime = objects.remove(new A(1));
        System.out.println("Try to remove second time: " + isRemovedOneMoreTime);

        objects.clear();

        System.out.println("Size after clearing: " + objects.size());

    }
}

class A extends Object {

    private final int value;

    public A(int value) {
        super();
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return value == a.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
