package ua.javarush.module2.project.example2.domain;

public enum Direction {

    RIGHT(1, 0),
    LEFT(-1, 0),
    UP(0,1);

    private final int deltaX;
    private final int deltaY;

    Direction(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public int getDeltaX() {
        return deltaX;
    }

    public int getDeltaY() {
        return deltaY;
    }
}
