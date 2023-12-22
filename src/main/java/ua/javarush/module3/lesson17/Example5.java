package ua.javarush.module3.lesson17;

public class Example5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setA(1);
        rectangle.setB(2);

        rectangle.info();
        rectangle.setA(3);

        System.out.println("=".repeat(100));
        rectangle.info();
    }

}

class Rectangle {
    private int a;
    private int b;

    public Rectangle() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void info() {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}

class Square extends Rectangle {
    @Override
    public void setA(int a) {
        super.setA(a);
        super.setB(a);
    }

    @Override
    public void setB(int b) {
        super.setB(b);
        super.setA(b);
    }
}
