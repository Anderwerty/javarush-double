package ua.javarush.module2.project.example2.domain;

public class Coordinate {
    private final int x;
    private final  int y;


    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
