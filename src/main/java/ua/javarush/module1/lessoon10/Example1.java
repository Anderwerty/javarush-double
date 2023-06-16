package ua.javarush.module1.lessoon10;

public class Example1 {
//    private static final double PI = 3.14;// static final, not final static
    private final static  double PI_1 = 3.14; // not write in such way

    public static void main(String[] args) {
        double radius = 10;
        double area = getArea(radius);
        double length = getPerimeter(radius);
    }

    private static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    // DRY
    private static double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
