package ua.javarush.module2.lesson2;

public class Example1 {
    public static void main(String[] args) {
        Figure figure = new Circle(10);
        System.out.println(figure.calculatePerimeter());


    }
}

abstract class Figure {
    protected String name;
    public abstract double calculatePerimeter();
}

class Circle extends Figure {

    private final double radius;

    Circle(double radius) {
        this.radius = radius;
        this.name ="circle";
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
