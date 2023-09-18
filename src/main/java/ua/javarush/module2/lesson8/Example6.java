package ua.javarush.module2.lesson8;

public class Example6 {
    public static void main(String[] args) throws Exception {
        new ClientService();
    }
}

class ClientService {
    private static final int CONSTANT = 100;
    private static final int CONSTANT2 = 1001;

    private static int counter = 0;


    private int value;
    private final int a = value + 1;

    {
        System.out.println("a=" + a);
        value = initValue();
        System.out.println("a=" + a);
        counter++;
    }

    public ClientService() throws Exception {
        super();
        // non-static block
        {
            System.out.println("block ....");
        }

        System.out.println("constructor");
    }


    private static int initValue() throws Exception {
        return 100;
    }
}
