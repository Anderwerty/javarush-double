package ua.javarush.module2.lesson13;

public class Example3 {
    public static void main(String[] args) {
        Runnable runnable = RunnableFactory.create();
        Thread thread = ThreadFactory.createThread(runnable);
        thread.start();
    }
}


class RunnableFactory {

    public static Runnable create() {

        return () -> {
            System.out.println("run....");
        };
    }
}

class ThreadFactory {

    public static Thread createThread(Runnable runnable){
        return  new Thread(runnable);
    }

    public static Thread create(){
        return  new Thread(() -> System.out.println(""));
    }

}


class PetShopService {
    private final IPetFactory petFactory;

    PetShopService(IPetFactory petFactory) {
        this.petFactory = petFactory;
    }

    public void buyPet(String money){
        Pet pet = petFactory.create(money);
        pet.say();
    }
}

interface IPetFactory {
    Pet create(String key);
}

interface Pet {

    void say();
}

class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("gaf-gaf");
    }
}

class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("mia-mia");
    }
}

