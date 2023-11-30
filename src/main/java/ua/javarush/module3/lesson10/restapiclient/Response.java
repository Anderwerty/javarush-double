package ua.javarush.module3.lesson10.restapiclient;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response<T> {
    private T item;

    private String errorMessage;
}
