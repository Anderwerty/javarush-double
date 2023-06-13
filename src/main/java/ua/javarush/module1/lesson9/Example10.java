package ua.javarush.module1.lesson9;

public class Example10 {
    public static void main(String[] args) {
        method();

        return;
    }

    private static void method() {
        for (int i = 0; i <20 ; i++) {
            if(i == 10){
                return;
            }
            System.out.println(i);
        }

        System.out.println("end of method");
    }
}
