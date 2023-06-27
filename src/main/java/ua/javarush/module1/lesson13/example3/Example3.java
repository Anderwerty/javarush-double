package ua.javarush.module1.lesson13.example3;

public class Example3 {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();

        System.out.println(account1.getId());
        System.out.println(account2.getId());

        account2.setId(2);

        System.out.println(account1.getId());
        System.out.println(account2.getId());

    }
}
