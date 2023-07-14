package ua.javarush.module1.lesson18;

import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Example4 {
    public static void main(String[] args) {
        TreeMap<B, Integer> bIntegerTreeMap = new TreeMap<>();
        bIntegerTreeMap.put(new B(1), 1);
//        bIntegerTreeMap.put(null, 1);

        TreeMap<C, Integer> cIntegerTreeMap = new TreeMap<>(new CComparator());
        cIntegerTreeMap.put(new C(1), 1000);

        System.out.println(cIntegerTreeMap.get(new C(1)));
//        cIntegerTreeMap.put(null, 0);

        Comparator<C> comparator = new Comparator<>() {
            @Override
            public int compare(C o1, C o2) {
                return o1.getValue() - o2.getValue();
            }
        };




        TreeMap<C, Integer> cIntegerTreeMap2 = new TreeMap<>(comparator);

        System.out.println(comparator.getClass());



        Object o = new Object() {
        };

        System.out.println(o.getClass());

    }
}


final class B implements Comparable<B> {
    private final int value;

    public B(int value) {
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
        B a = (B) o;
        return value == a.value;
    }

    @Override
    public String toString() {
        return "B{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(B that) {
        // this > that ---> +
        // this < that ---> -
        // this = that ---> 0
        return this.value - that.value;
    }
}

final class C {
    private final int value;

    public C(int value) {
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
        C a = (C) o;
        return value == a.value;
    }

    @Override
    public String toString() {
        return "C{" +
                "value=" + value +
                '}';
    }
}

class CComparator implements Comparator<C> {
    @Override
    public int compare(C o1, C o2) {
        return o1.getValue() - o2.getValue();
    }
}


