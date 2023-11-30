package ua.javarush.module3.lesson10.restapiclient;

import lombok.Getter;

@Getter
public class Page implements QueryParameters {
    private final int page;
    private final int perPage;

    public Page(int page, int perPage) {
        this.page = page;
        this.perPage = perPage;
    }

    @Override
    public String query() {
        return String.format("page=%d&per_page=%d", page, perPage);
    }
}
