package ua.javarush.module4.lesson8.entity;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Customer {

    private Integer id;

//    @ToString.Exclude
    private String name;

    private String sex;

    private String email;

    private int telephone;

    private String address;
}
