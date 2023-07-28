package ua.javarush.module1.lesson22;

public class Example6 {
    public static void main(String[] args) {
        try (Resource2 resource = new Resource2()) {
            resource.execute();
        } catch (Exception e) {
            System.out.println("handle exception");
        }
    }
}

class Resource2 implements AutoCloseable {
    public Resource2() throws Exception {
//         throw new Exception();
    }

    public void execute() {
        System.out.println("..........");

//        System.exit(0);
        throw new RuntimeException();
    }

    @Override
    public void close() {
        // throw new exception
        System.out.println("close resource");
    }
}
