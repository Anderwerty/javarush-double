package ua.javarush.module2.project.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;

public class Island {
    private final Location[][] area;


    public Island(int xSize, int ySize){
        area = new Location[xSize][ySize];
        inhabitIsland(area);
    }

    public void live(){
        // implement this method

        // Tasks: 1) eat() 2) increase() 3) move() 4) print statistics
    }

    private static void inhabitIsland(Location [][] area){
    }
}
