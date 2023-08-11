package ua.javarush.module1.lesson26;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example3 {
    public static void main(String[] args) throws IOException {
        Path root = Path.of("src/main/resources").toAbsolutePath();
        try (DirectoryStream<Path> files = Files.newDirectoryStream(root)) {
            for (Path path : files)
                System.out.println(path);
        }
    }
}
