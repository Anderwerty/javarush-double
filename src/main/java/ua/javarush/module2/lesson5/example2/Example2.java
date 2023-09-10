package ua.javarush.module2.lesson5.example2;

public class Example2 {
    public static void main(String[] args) {
        // java 7+
        Container<Integer> container = new Container<>(1);

        Integer objectValue = container.getValue();

        System.out.println(objectValue);

        Container<String> stringContainer = new Container<>("String");

        System.out.println(container.getClass().getName());
        System.out.println(stringContainer.getClass().getName());

        System.out.println(container.getClass() == stringContainer.getClass());
    }
}

class Container<T> { // T, E, K, V, I, O
    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
