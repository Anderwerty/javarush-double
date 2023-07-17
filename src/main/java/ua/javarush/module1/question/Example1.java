package ua.javarush.module1.question;

public class Example1 {
    public static void main(String[] args) {
        byte value = 127;

        value++;
        System.out.println("value: " + value); // -128

        // but if we try to use, it won't work. try to uncomment

        // value = value +1;

        value += 2; // it works

        byte value1 = 1;
        value1 += 3.1;

        System.out.println(value1); // it will be 4
        // why?: it works as  value1 += 3.1 ====> value1= (byte)( value1 + (byte) 3.1)

    }
}
