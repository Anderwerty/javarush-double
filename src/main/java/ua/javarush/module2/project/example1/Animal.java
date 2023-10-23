package ua.javarush.module2.project.example1;

//
public abstract class Animal {
    private int weight; // private int healthPoints; [0, 100]
    private char image;


    public abstract void eat(Location location);

    public Coordinate move (Location location){
        // implementation
        return null;
    }


    //abstract
    public void increase(Location location){

    }



}
