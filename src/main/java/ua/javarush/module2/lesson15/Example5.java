package ua.javarush.module2.lesson15;

public class Example5 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                if (true) {
                    System.out.println("............");
                    Object o = new Object() {
                    };
                    System.out.println(o.getClass().getName());

                }
            }
        };
        String name = thread.getClass().getName();
        System.out.println(name);
        thread.start();
    }
}
