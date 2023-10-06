package ua.javarush.module2.lesson13;

import java.util.List;

public class Example4 {
    public static void main(String[] args) {

    }
}

class Worker extends Thread {
    private List<Runnable> tasks;


    @Override
    public void run() {
        while (true){
            tasks.get(0).run();
            tasks.remove(0);
        }
    }
}
