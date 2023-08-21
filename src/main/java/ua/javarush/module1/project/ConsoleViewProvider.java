package ua.javarush.module1.project;

import java.util.Scanner;

public class ConsoleViewProvider {

    public String read(){
       try( Scanner scanner = new Scanner(System.in)){
           return scanner.next();

       }
    }

    public int readInt(){
        throw  new UnsupportedOperationException();
    }

    public void print(String message){

    }
}
