package ua.javarush.module1.lesson24;

public class Example2 {

    public static void main(String[] args) {
        EmptyPizza emptyPizza = new EmptyPizza();
        PizzaWithCheese pizzaWithCheese = new PizzaWithCheese(emptyPizza);
        PizzaWithTomato pizzaWithCheeseAndTomato = new PizzaWithTomato(pizzaWithCheese);
        PizzaWithCheese pizzaWithCheeseAndTomatoAndCheese = new PizzaWithCheese(pizzaWithCheeseAndTomato);
        pizzaWithCheeseAndTomatoAndCheese.cook();
    }

}

interface  Pizza {
    public abstract void cook();
}

class EmptyPizza implements Pizza {

    @Override
    public void cook() {
        System.out.println("empty pizza");
    }
}

class PizzaWithCheese implements Pizza {
    private final Pizza pizza;

    PizzaWithCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void cook() {
        pizza.cook();
        System.out.println("add cheese");
    }
}

class PizzaWithTomato implements Pizza {
    private final Pizza pizza;

    PizzaWithTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void cook() {
        pizza.cook();
        System.out.println("add tomato");
    }
}
