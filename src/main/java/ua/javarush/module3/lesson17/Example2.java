package ua.javarush.module3.lesson17;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Example2 {
    public static void main(String[] args) {
        MyClass integers = new MyClass(1, 2, 3);

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}

class MyClass implements Iterable<Integer> {
    private final int value1;
    private final int value2;
    private final int value3;

    public MyClass(int value1, int value2, int value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            int currentPosition = 0;

            @Override
            public boolean hasNext() {
                return currentPosition < 3;
            }

            @Override
            public Integer next() {
                if (currentPosition == 0) {
                    currentPosition++;
                    return value1;
                } else if (currentPosition == 1) {
                    currentPosition++;
                    return value2;
                } else if (currentPosition == 2) {
                    currentPosition++;
                    return value3;
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }
}
