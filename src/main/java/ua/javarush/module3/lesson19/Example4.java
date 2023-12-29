package ua.javarush.module3.lesson19;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        BeeperControl beeperControl = new BeeperControl();
        beeperControl.beeping();

        TimeUnit.SECONDS.sleep(100);
        beeperControl.executorService.shutdownNow();
    }
}

class BeeperControl{

    public final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
    private final Runnable runnable = () -> System.out.println("beep");


    public void beeping(){
        executorService.scheduleAtFixedRate(runnable, 1, 1, TimeUnit.SECONDS);
    }
}
