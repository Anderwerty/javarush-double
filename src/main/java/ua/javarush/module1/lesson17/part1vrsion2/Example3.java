package ua.javarush.module1.lesson17.part1vrsion2;

import java.util.HashSet;
import java.util.Objects;

public class Example3 {
    public static void main(String[] args) {
        HashSet<C> set = new HashSet<>();
        set.add(new C(1));
        set.add(new C(2));
        C e = new C(1);
        set.add(e);
        set.add(e);

        System.out.println(set.size());
    }
}

class C extends Object {

    private final int value;

    public C(int value) {
        this.value = value;
    }

    public int getValue() {
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
        C c = (C) o;
        return value == c.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
