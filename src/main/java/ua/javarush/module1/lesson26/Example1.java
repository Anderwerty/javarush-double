package ua.javarush.module1.lesson26;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Example1 {

    private static final int BUFFER_CAPACITY = 100;

    public static void main(String[] args) throws IOException {
        String filePath = "src/main/resources/module1.lesson26/data.txt";
        try (RandomAccessFile accessFile = new RandomAccessFile(filePath, "rw");
             FileChannel channel = accessFile.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(BUFFER_CAPACITY);

            int size;

            while ((size = channel.read(buffer)) != -1) {
                System.out.println("size: " + size);
                buffer.flip();

//                while (buffer.hasRemaining()) {
//                    System.out.print((char) buffer.get());
//                }
                System.out.print(new String(buffer.array()));
                buffer.mark();
                buffer.reset();
                buffer.clear();
            }

        }

    }
}
