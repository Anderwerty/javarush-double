package ua.javarush.module2.lesson5;

public class Example3 {
    public static void main(String[] args) {
        Pair<int[], Integer> pair = new Pair<>(new int[]{1}, 2);

        System.out.println("=====");
        Pair<Integer, Pair<Integer, String>> pair2 =
                new Pair<>(1, new Pair<>(1,"String"));
    }
}

class Pair<K, V> {
    private K key;
    private V[] value;

    public Pair(K key, V... value) {
        this.key = key;
        this.value = value;

        System.out.println(key.getClass().getName());
        System.out.println(value.getClass().getName());
    }

    public K getKey() {
        return key;
    }

    public V[] getValue() {
        return value;
    }
}

/*class MyException<T> extends Exception {

}*/
