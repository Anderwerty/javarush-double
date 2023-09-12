package ua.javarush.module2.lesson6;

import java.util.function.Function;

public class Example6 {
    public static void main(String[] args) {
        City city = new City("Kyiv");
//        City city = null;
        Address address = new Address(city);
        Client client = new Client(address);

        String cityName2 = null;
        if (client != null) {
            Address address1 = client.getAddress();
            if (address1 != null) {
                City city1 = address1.getCity();
                if (city1 != null) {
                    cityName2 = city1.getName();
                }
            }
        }
//        String cityName = client.getAddress().getCity().getName();

//        System.out.println(cityName);


        String city2 = MyOptional.ofNullable(client)
                .map(Client::getAddress)
                .map(Address::getCity)
                .map(City::getName)
                .getOrElse("*****");

        System.out.println(city2);


    }
}

class Client {
    private Address address;

    public Client(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

class Address {
    private City city;

    public Address(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}

class City {
    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class MyOptional<T> {
    private static final MyOptional EMPTY = new MyOptional(null);

    private final T value;


    private MyOptional(T value) {
        this.value = value;
    }

    public static <E> MyOptional<E> ofNullable(E value) {
        return value == null ? EMPTY : new MyOptional<>(value);
    }

    public <E> MyOptional<E> map(Function<T, E> mapper) {
        if (value == null) {
            return EMPTY;
        }

        E newValue = mapper.apply(value);
        return newValue == null ? EMPTY : new MyOptional<>(newValue);
    }


    public T get(){
        if(value == null){
            throw new RuntimeException();
        }

        return value;
    }


    public T getOrElse(T defaultValue){
        return value==null? defaultValue: value;
    }
}
