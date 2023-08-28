package ua.javarush.module2.lesson1;

public class Example1 {
}

class Client {

    private int balance = 0;


    private void addMoney(int money) {
        if (money < 0) {
            throw new IllegalArgumentException("meesage");
        }
        balance = balance + money;
    }

    public void buy(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("");
        }

        if (balance - price < 0) {
            throw new RuntimeException(); // custom exception
        }

        balance = balance - price;
    }


}
