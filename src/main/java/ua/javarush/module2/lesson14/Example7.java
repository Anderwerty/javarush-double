package ua.javarush.module2.lesson14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Example7 {
    public static void main(String[] args) {
    }
}

class Worker extends Thread {

    private Runnable currentTask;

    public Worker() {
    }


    @Override
    public void run() {
        boolean isWorking = true;
        while (isWorking) { // 1. timeout, 2 - is pool active
            executeTask(currentTask);
        }
    }

    private void executeTask(Runnable currentTask) {
    }
}

class MyThreadPool implements ExecutorService {

    private final int initialCapacity;
    private final int maxCapacity;
    private final long timeOut;

    private boolean isInShutDownProcess = false;

    private int currentCapacity;

    private List<Worker> workers = new ArrayList<>();
    private List<Runnable> tasksForExecution = new ArrayList<>();
    private List<Runnable> executedTasks = new ArrayList<>();

    MyThreadPool(int initialCapacity, int maxCapacity, long timeOut) {
        this.initialCapacity = initialCapacity;
        this.currentCapacity = initialCapacity;
        this.maxCapacity = maxCapacity;
        this.timeOut = timeOut;
        for (int i = 1; i <= initialCapacity; i++) {
            workers.add(new Worker());
        }
    }

    @Override
    public void shutdown() {
        this.isInShutDownProcess = true;
        //...
    }


    @Override
    public List<Runnable> shutdownNow() {
        return null;
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        if(isInShutDownProcess) {
            throw new RejectedExecutionException();
        }

        if(tasksForExecution.size()>currentCapacity*2 && currentCapacity<maxCapacity){
            Worker worker = new Worker();
            worker.start();
            workers.add(worker);
        }

        //
        return null;
    }

    @Override
    public <T> Future<T> submit(Runnable task, T result) {
        if(isInShutDownProcess) {
            throw new RejectedExecutionException();
        }
        tasksForExecution.add(task);
        return null;
    }

    @Override
    public Future<?> submit(Runnable task) {
        return null;
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return null;
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return null;
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return null;
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    @Override
    public void execute(Runnable command) {

    }
}
