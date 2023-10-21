package ua.javarush.module2.lesson19.example1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 8082;
        try(ServerSocket server = new ServerSocket(port);){
            server.setSoTimeout(100_000);

            while (true) {
                Socket listenedSocket = server.accept();
                try (InputStream inputStream = listenedSocket.getInputStream();
                     DataInputStream dataInputStream = new DataInputStream(inputStream);) {
                    String readValue = dataInputStream.readUTF();
                    System.out.println(readValue);
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
