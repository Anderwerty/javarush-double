package ua.javarush.module3.lesson10.restapiclient;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Builder(setterPrefix = "with")
public class User {
    private Long id;
    private String name;
    private String email;
    private String gender;
    private String status;
}
