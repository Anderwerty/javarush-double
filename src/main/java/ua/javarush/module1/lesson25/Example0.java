package ua.javarush.module1.lesson25;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example0 {
    public static void main(String[] args) {
        String name = "src/main/resources/module1.lesson25/file.txt";
        try (BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(name))) {
            int numberOfBytes;
            byte[] buffer = new byte[5];
            while ((numberOfBytes = fileInputStream.read(buffer)) != -1) {
                System.out.print(bufferToString(numberOfBytes, buffer));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Error");
        }
        System.out.println("=".repeat(100));

    }

    private static String bufferToString(int numberOfBytes, byte[] buffer) {
        byte[] tempBytes = new byte[numberOfBytes];
        System.arraycopy(buffer, 0, tempBytes, 0, numberOfBytes);
        return new String(tempBytes);
    }
}
