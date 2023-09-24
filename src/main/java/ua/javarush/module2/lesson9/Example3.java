package ua.javarush.module2.lesson9;

public class Example3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        String originalMessage = "hi";
        A1 originalA1 = new A1();
        MyObject o = new MyObject(1, originalMessage, originalA1);
        MyObject clone = o.clone();

        System.out.println(o == clone);
        System.out.println(clone.getValue());
        String clonedMessage = clone.getMessage();
        System.out.println(clonedMessage);
        System.out.println(originalMessage == clonedMessage);
        System.out.println(originalA1 == clone.getA1());

    }
}

class MyObject extends Object implements Cloneable {

    private final int value;
    private final String message;
    private  A1 a1;

    public MyObject(int value, String message, A1 a1) {
        System.out.println("Constructor");
        this.value = value;
        this.message = message;
        this.a1 = a1;
    }

    public int getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    public A1 getA1() {
        return a1;
    }

    @Override
    public MyObject clone() throws CloneNotSupportedException {
        MyObject rawClonedObject =(MyObject) super.clone();
        rawClonedObject.a1 = this.a1.clone();
        return rawClonedObject;
    }
}


class A1 implements Cloneable {

    @Override
    public A1 clone() throws CloneNotSupportedException {
        return (A1)super.clone();
    }
}
