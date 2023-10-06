package ua.javarush.module2.lesson13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Example6 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Long> longCallableFuture =
                executorService.submit(new LongCallable());

        Container<Long> container = new Container<>();
        Future<?> runnableFuture = executorService.submit(new LongRunnable(container));
        Long l1 = longCallableFuture.get();
        System.out.println(l1);
//        TimeUnit.SECONDS.sleep(5);

        runnableFuture.get();
        System.out.println(container.getValue());

        executorService.shutdown();
        executorService.shutdownNow();

        Future<Long> submit = executorService.submit(new LongCallable());
    }
}

class LongCallable implements Callable<Long> {

    @Override
    public Long call() throws Exception {
//        TimeUnit.SECONDS.sleep(10);
        long sum = 0;
        for (int i = 0; i < 2_000_000; i++) {
            sum += i;
        }

        return sum;
    }
}

class LongRunnable implements Runnable {
    private final Container<Long> container;

    LongRunnable(Container<Long> container) {
        this.container = container;
    }

    @Override
    public void run() {
        long sum = 0;
        for (int i = 0; i < 2_000_000; i++) {
            sum += i;
        }

        container.setValue(sum);
    }
}

class Container<V> {
    V value;

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
