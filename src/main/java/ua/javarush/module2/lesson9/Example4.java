package ua.javarush.module2.lesson9;


public class Example4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        String originalMessage = "hi";
        A2 originalA1 = new A2();
        MyObject2 o = new MyObject2(1, originalMessage, originalA1);
        System.out.println("....");
        MyObject2 clone = o.clone();

        System.out.println(o == clone);
        System.out.println(clone.getValue());
        String clonedMessage = clone.getMessage();
        System.out.println(clonedMessage);
        System.out.println(originalMessage == clonedMessage);
        System.out.println(originalA1 == clone.getA1());

    }
}

class MyObject2 extends Object {

    private final int value;
    private final String message;
    private A2 a2;

    public MyObject2(int value, String message, A2 a2) {
        System.out.println("Constructor");
        System.out.println("......");
        this.value = value;
        this.message = message;
        this.a2 = a2;
    }

    public MyObject2(MyObject2 that) {
        this.value = that.value;
        this.message = new String(that.message);
        this.a2 = new A2();
    }


    public int getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    public A2 getA1() {
        return a2;
    }

    @Override
    public MyObject2 clone() {
        return new MyObject2(this.value, new String(this.message), new A2());
    }
}


class A2 {

    @Override
    public A2 clone() {
//        super.clone();
        return new A2();
    }
}

