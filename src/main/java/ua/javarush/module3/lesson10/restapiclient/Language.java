package ua.javarush.module3.lesson10.restapiclient;

import lombok.Getter;

@Getter
public class Language implements QueryParameters {
    private final String language;

    Language(String language) {
        this.language = language;
    }

    @Override
    public String query() {
        return String.format("language=%s", language);
    }
}
