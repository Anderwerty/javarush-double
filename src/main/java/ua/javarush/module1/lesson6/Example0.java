package ua.javarush.module1.lesson6;

public class Example0 {
    // C/C++ goto
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 5; i++) {
            innerLoop:
            for (int j = 0; j < 5; j++) {
                if (i != j) {
                    System.out.println("If block values " + i);
                    break outerLoop;
                } else {
                    System.out.println("Else block values " + i);
                    continue innerLoop;
                }
            }
        }
    }
}
