package ua.javarush.module1.lesson23;

public class Example5 {
    public static void main(String[] args) {
        // 5! = 1*2*3*4*5 =120
        // 1!= 1
        // 0! = 1

        //5! = 1*2*3*4*5 =4!*5 =3!*4*5
        //4! = 1*2*3*4
        //3! =1*2*3

        //...
        // n! = (n-1)!*n

        int result = factorial(5);
        System.out.println(result);

        System.out.println(factorial2(5));


    }

    // 1*2*3*4*...*n
    public static int factorial(int n) {

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // n! = (n-1)!*n
    public static int factorial2(int n) {
        return n == 0 ? 1 : factorial2(n - 1) * n;
    }
}
