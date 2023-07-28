package ua.javarush.module1.lesson22;

public class Example5 {
    public static void main(String[] args) {

//        Resource resource1 = new Resource();
//        resource1.execute();
//        resource1.close();
// before java 7
        Resource resource = null;
        try {
            resource = new Resource();
            resource.execute();
        } catch (Exception e) {
            System.out.println("handle exception");
        } finally {
            if (resource != null) {
                try {
                    resource.close();
                } catch (Exception e){
                    System.out.println("handle exception during closing resources");
                }
            }
        }
    }
}

class Resource {

    public Resource() {
        throw new RuntimeException();
    }

    public void execute() {
        System.out.println("..........");

        throw new RuntimeException();
    }

    public void close() {
        // throw new exception
        System.out.println("close resource");
    }
}
