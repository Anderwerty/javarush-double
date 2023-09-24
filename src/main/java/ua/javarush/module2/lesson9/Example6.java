package ua.javarush.module2.lesson9;

public class Example6 {
    public static void main(String[] args) {
        B b = new B(1000);
        ImmutableClass immutableClass = new ImmutableClass(1, b);

        b.setValue(100000);

        B b1 = immutableClass.getB();
    }
}

final class ImmutableClass {
    private final int value;
    private final B b;

    public ImmutableClass(int value, B b) {
        this.value = value;
        this.b = copyB(b);
    }

    public int getValue() {
        return value;
    }

    public B getB() {
        return copyB(b);
    }

    private B copyB(B b) {
        return b == null ? null : new B(b.getValue());
    }
}

class B {
    private int value;

    public B(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
