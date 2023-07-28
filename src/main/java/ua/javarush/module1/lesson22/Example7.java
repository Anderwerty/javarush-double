package ua.javarush.module1.lesson22;

public class Example7 {

    public static void main(String[] args) {


        try (ResourceA resourceA = new ResourceA();
             ResourceB resourceB = new ResourceB(resourceA)) {

            //...
            System.out.println("Work wih resources");
            throw new RuntimeException();
        } catch (Exception exception) {

            System.out.println("handle exception");
        }
    }
}

class ResourceA implements AutoCloseable {

    @Override
    public void close() {

        System.out.println("close resource A");
    }
}

class ResourceB implements AutoCloseable {

    private ResourceA resourceA;

    ResourceB(ResourceA resourceA) {
        this.resourceA = resourceA;
    }

    @Override
    public void close() {
        resourceA.close();
        System.out.println("close resource B");
    }
}
