package ua.javarush.module3.lesson10.restapiclient;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class URIBuilder {
    private String url;
    private String resource;

    private final List<QueryParameters> queries = new ArrayList<>();


    private URIBuilder() {
    }

    public static URIBuilder builder() {
        return new URIBuilder();
    }

    public URIBuilder withURL(String url) {
        this.url = url;

        return this;
    }

    public URIBuilder withResource(String resource) {
        this.resource = resource;

        return this;
    }

    public URIBuilder withQueryParameters(QueryParameters queryParameters) {
        this.queries.add(queryParameters);

        return this;
    }

    public URI build() {
        String link = new StringBuilder()
                .append(url)
                .append(resource)
                .append(queries())
                .toString();

        System.out.println("link: " + link);
        return URI.create(link);
    }

    private String queries() {
        if (queries.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder("?");

        queries.forEach(item -> builder.append(item.query() + "&"));

        return builder.toString();
    }


}
