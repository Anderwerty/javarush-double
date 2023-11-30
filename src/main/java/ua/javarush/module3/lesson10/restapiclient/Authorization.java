package ua.javarush.module3.lesson10.restapiclient;

import lombok.Getter;

@Getter
public class Authorization implements QueryParameters {
    private final String token;

    public Authorization(String token) {
        this.token = token;
    }


    @Override
    public String query() {
        return String.format("access-token=%s", token);
    }
}
