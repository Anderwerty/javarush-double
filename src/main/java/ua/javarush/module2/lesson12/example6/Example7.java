package ua.javarush.module2.lesson12.example6;

public class Example7 {
    public static void main(String[] args) {
        Container container = new Container();

        // without synchronization
        // Consumer =
        // Producer =
    }
}

class Container {
    private volatile int value;

    //10
    public void increase() {
        value++; // value = value + 1
    }

    public void decrease() {
        value--;
    }
}
