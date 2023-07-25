package ua.javarush.module1.lesson21;

public class Example1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        }catch (ArithmeticException ex){
            System.out.println("Divisor is zero!");
            System.out.println(ex);
            System.err.println(ex);
            ex.printStackTrace();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
