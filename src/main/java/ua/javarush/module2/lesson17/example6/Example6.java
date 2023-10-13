package ua.javarush.module2.lesson17.example6;

public class Example6 {
    public static void main(String[] args) {
        Service service = new ServiceProxy();
        service.execute();

    }
}

interface Service {
    void execute();
}

class ServiceImpl implements Service {

    @Override
    public void execute() {
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class ServiceProxy implements Service {
    private final Service service = new ServiceImpl();

    @Override
    public void execute() {
        long start = System.currentTimeMillis();
        service.execute();
        long end = System.currentTimeMillis();

        System.out.println("time: " + (end - start) + "ms");
    }
}
