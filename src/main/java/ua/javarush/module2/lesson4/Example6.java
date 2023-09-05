package ua.javarush.module2.lesson4;

public class Example6 {
    public static void main(String[] args) {

    }
}


// java 7 ---> java 8
interface List {
    int size();

    void add(String item);

    default String stream() {
        throw new UnsupportedOperationException();
    }
}

class MyArrayList implements List {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public void add(String item) {
        //...
    }
}
