package ua.javarush.module1.lesson26;

import java.io.File;
import java.nio.file.Path;

public class Example2 {
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/module1.lesson26/data.txt");

        System.out.println(path.toAbsolutePath());
        System.out.println(path.getFileName());
        System.out.println(path.getRoot());
        System.out.println(path.getNameCount());
        File file = path.toFile();

        System.out.println("=".repeat(10));
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
    }

    // sout filename, file context, extensions, size
    public static void searchInFile(File file){
        // your implementation
        // use just API from File class
    }

    public static void searchInFile(Path path){
        // your implementation
        //use just API from Path and Files
    }
}
