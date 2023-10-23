package ua.javarush.module2.project.example1;

import java.util.Scanner;

public class ConsoleViewProvider {

    public void printMessage(String message){
        System.out.println(message);
    }


    public String readFromConsole(){
        return new Scanner(System.in).next();
    }

    public int readInt(){
      return   Integer.valueOf(readFromConsole());
    }
}
