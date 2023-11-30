package ua.javarush.module3.lesson10.restapiclient;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class GoRestClientImpl implements GoRestClient {
    private static final String URL = "https://gorest.co.in/";

    //TODO: Should be replaced with our token
    private static final String TOKEN = "648b6d5312234a73d37b2807309e79f22acbbfa8c8562aa43c8e248726880d2b";

    // better to inject client and gson
    private final HttpClient client = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofMinutes(1))
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build();

    private final Gson gson = new Gson();

    @Override
    public List<User> findAllUsers(Page page) {
        try {
            URI uri = URIBuilder.builder()
                    .withURL(URL)
                    .withResource("public/v2/users")
                    .withQueryParameters(page)
                    .build();

            HttpRequest usersRequest = HttpRequest.newBuilder()
                    .GET()
                    .uri(uri)
                    .build();

            HttpResponse<String> usersResponse = client.send(usersRequest, HttpResponse.BodyHandlers.ofString());
            int statusCode = usersResponse.statusCode();
            String body = usersResponse.body();
            if (statusCode != 200) {
                throw new GoRestRuntimeException("Status: " + statusCode + ", message: " + body);
            }

            User[] users = gson.fromJson(body, User[].class);
            return Arrays.stream(users).toList();

        } catch (Exception e) {
            throw new GoRestRuntimeException(e);
        }
    }

    @Override
    public User createNewUser(User user) {
        try {
            URI uri = URIBuilder.builder()
                    .withURL(URL)
                    .withResource("public/v2/users")
                    .withQueryParameters(new Authorization(TOKEN))
                    .build();

            String json = gson.toJson(user);

            HttpRequest userCreationRequest = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .setHeader("Content-type", "application/json")
                    .uri(uri)
                    .build();


            HttpResponse<String> usersResponse = client.send(userCreationRequest, HttpResponse.BodyHandlers.ofString());
            int statusCode = usersResponse.statusCode();
            String body = usersResponse.body();
            if (statusCode != 200 && statusCode != 201) {
                throw new GoRestRuntimeException("Status: " + statusCode + ", message: " + body);
            }

            User userResult = gson.fromJson(body, User.class);
            return userResult;

        } catch (Exception e) {
            throw new GoRestRuntimeException(e);
        }
    }
}
