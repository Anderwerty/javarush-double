package ua.javarush.module2.project;

public class MovingService {

    public Coordinate getDestination(Coordinate currentCoordinates, int max) {
        int stepsToMake = randomNumber(max);
        Direction direction = chooseDirection(currentCoordinates);

        int x = currentCoordinates.getX();
        int y = currentCoordinates.getY();
        return new Coordinate(x + direction.getDeltaX() * stepsToMake,
                y + direction.getDeltaY() * stepsToMake);
    }


    private int randomNumber(int max) {
        return 0;
    }

    private Direction chooseDirection(Coordinate coordinate) {
        return null;
    }
}
