package ua.javarush.module1.lesson25;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {


    public static void main(String[] args) {
        String fileSource = "src/main/resources/module1.lesson25/file.txt";
        String fileDestination = "src/main/resources/module1.lesson25/file3.txt";
        FileProcessor fileProcessor = new FileToUpperCaseProcessor();

        fileProcessor.processFile(fileSource, fileDestination);
    }

}

class FileProcessor {
    private static final int DEFAULT_BUFFER_SIZE = 10;

    private final int bufferSize;

    public FileProcessor() {
        this.bufferSize = DEFAULT_BUFFER_SIZE;
    }

    public FileProcessor(int bufferSize) {
        if (bufferSize <= 0) {
            throw new IllegalArgumentException("<Your message>");
        }

        this.bufferSize = bufferSize;
    }

    public void processFile(String sourceFile, String destinationFile) {
        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile, false)
        ) {
            char[] buffer = new char[bufferSize];

            int numbersOfSymbols;
            while ((numbersOfSymbols = reader.read(buffer)) != -1) {
                String line = bufferToString(buffer, numbersOfSymbols);
                String lineResult = convert(line);
                writer.write(lineResult);
//                System.out.print(bufferToString(buffer, numbersOfSymbols));
            }

        } catch (IOException e) {
            longException(e);
        }
    }

    public String convert(String line) {
        return line;
    }

    private static String bufferToString(char[] buffer, int numbersOfSymbols) {
        if (buffer.length != numbersOfSymbols) {
            char[] tempBytes = new char[numbersOfSymbols];
            System.arraycopy(buffer, 0, tempBytes, 0, numbersOfSymbols);
            return new String(tempBytes);
        } else {
            return new String(buffer);
        }
    }

    private static void longException(IOException e) {
        e.printStackTrace();
    }
}

class FileToUpperCaseProcessor extends FileProcessor {

    @Override
    public String convert(String line) {
        return line.toUpperCase();
    }
}
