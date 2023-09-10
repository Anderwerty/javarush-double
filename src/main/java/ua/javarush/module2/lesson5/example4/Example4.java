package ua.javarush.module2.lesson5.example4;

public class Example4 {

    public static void main(String[] args) {
        Container<Double> doubleContainer = new Container<>(1.0, 2.0, 3.0);
        Container<Integer> intContainer = new Container<>(1, 2, 3);
        Container<Long> longContainer = new Container<>(1L, 2L, 3L);

        Container<Number> numberContainer = new Container<>();
        Container<? extends Number> container = new Container<>();

//        Container container2 = new Container(2,2.0, "string");

        System.out.println(doubleContainer.compare(numberContainer));

//        numberContainer = longContainer;

        System.out.println("a".concat("b"));

    }
}


class Container<T extends Number> {
    T[] values;

    public Container(T... values) {
        this.values = values;
    }

    public double avarage() {
        double sum = 0;
        for (T value : values) {
            sum = sum + value.doubleValue();
        }

        return sum / values.length;
    }


    public int compare(Container<? extends Number> container){
        return (int) (this.avarage() - container.avarage());
    }
}