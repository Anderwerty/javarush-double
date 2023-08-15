package ua.javarush.module1.lesson27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        Address one = new Address("One");
        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(one);

        User alex = new User("Alex", addresses);

        System.out.println(alex.getAddresses().size());

        addresses.add(null);

        System.out.println(alex.getAddresses().size());

//        alex.getAddresses().add(null);
//        System.out.println(alex.getAddresses().size());

        alex.getAddresses().get(0).setAddress("Two");

    }
}

final class User {
    private final String name;
    private final List<Address> addresses;

    public User(String name, List<Address> addresses) {
        this.name = name;

        // copy  --->
        this.addresses = copyItems(addresses);
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return copyItems(addresses);
    }

    private List<Address> copyItems(List<Address> addresses) {
        ArrayList<Address> objects = new ArrayList<>();

        for (Address address : addresses) {
            objects.add(new Address(address.getAddress()));
        }

        return Collections.unmodifiableList(objects);
    }
}

class Address {
    private String address;

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}