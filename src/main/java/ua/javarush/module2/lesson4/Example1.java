package ua.javarush.module2.lesson4;

public class Example1 {
    public static void main(String[] args) {
        Executable executable = new ExecutableImpl();
        System.out.println(executable.count());
    }
}

interface Executable {
    void execute();

    int count();
}

class ExecutableImpl implements Executable {

    @Override
    public void execute() {

    }

    @Override
    public int count() {
        return 0;
    }
}