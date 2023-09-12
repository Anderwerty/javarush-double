package ua.javarush.module2.lesson6;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example7 {

    public static void main(String[] args) {
        List<Client> clients = Arrays.asList(
                null,
                new Client(new Address(null)),
                new Client(new Address(new City(null))),
                new Client(new Address(new City("Kyiv"))),
                new Client(new Address(new City("Lviv"))),
                new Client(new Address(new City("Lviv")))
                );

        Stream<Address> addressStream = clients.stream()
                .filter(Objects::nonNull)
                .map(Client::getAddress);

        long count = addressStream.count();

        System.out.println(count);

        List<String> collect = clients.stream()
                .filter(Objects::nonNull)
                .map(Client::getAddress)
                .filter(Objects::nonNull)
                .map(Address::getCity)
                .filter(Objects::nonNull)
                .map(City::getName)
                .filter(Objects::nonNull)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
