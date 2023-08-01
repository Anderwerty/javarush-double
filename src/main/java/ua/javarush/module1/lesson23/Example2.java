package ua.javarush.module1.lesson23;

import java.io.Closeable;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) throws RuntimeException  {


        try(java.util.Scanner scanner = new java.util.Scanner(System.in)) {
           throw new RuntimeException();
       }
    }
}
