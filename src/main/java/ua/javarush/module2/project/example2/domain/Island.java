package ua.javarush.module2.project.example2.domain;

import ua.javarush.module2.project.example2.domain.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Island {
    private final Location[][] area;


    public Island(int xSize, int ySize) {
        area = new Location[xSize][ySize];
        inhabitIsland(area);
    }

    public void live() {
        // implement this method

        // Tasks: 1) eat() 2) increase() 3) move() 4) print statistics

        List<EatTask> eatTasks = new ArrayList<>(); //??

        // isAlive false remove

        //*****

        //2)


        //3)

        List<MoveTask> moveTasks = new ArrayList<>();//???


    }

    private static void inhabitIsland(Location[][] area) {
    }
}

interface Task {
    void execute();
}


class EatTask implements Task {

    private final Location location;

    EatTask(Location location) {
        this.location = location;
    }

    @Override
    public void execute() {
        location.animals.forEach(animal -> animal.eat(location));
        // clean dead animals from location
    }
}

class MoveTask implements Task {

    private final Location current;
    private final Location destination;

    private final Animal animal;

    MoveTask(Location current, Location destination, Animal animal) {
        this.current = current;
        this.destination = destination;
        this.animal = animal;
    }

    @Override
    public void execute() {
        current.lock.lock();
        destination.lock.lock();// think about deadlock

        boolean isPossibleToMove = true;
        if(isPossibleToMove){ //double-check
            current.removeAnimalFromLocation(animal);
            destination.addAnimalToLocation(animal);
        }

        destination.lock.unlock();
        current.lock.unlock();
    }
}
