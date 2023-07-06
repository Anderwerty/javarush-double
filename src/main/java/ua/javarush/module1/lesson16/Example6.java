package ua.javarush.module1.lesson16;

public class Example6 {
    public static void main(String[] args) {
        Container<Integer, Long> integerContainer1 = new Container<Integer, Long>();
        Container<Integer, Long> integerContainer2 = new Container<>();
    }
}

class Container<T, E> {
    T object;
    E object2;
    // setters + getters

}
