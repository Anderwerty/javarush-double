package ua.javarush.module2.lesson19.example1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 8082;
        boolean isWorking = true;
        while (isWorking) {
            try (Socket socket = new Socket(host, port);
                 OutputStream outputStream = socket.getOutputStream();
                 DataOutputStream dataOutputStream = new DataOutputStream(outputStream)) {
                dataOutputStream.writeUTF("Hello server!");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
