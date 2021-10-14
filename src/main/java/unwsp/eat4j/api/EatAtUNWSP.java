package unwsp.eat4j.api;

import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class EatAtUNWSP {

    private static final String URL = "https://eat-at-unwsp.draylar.dev/";
    private final HttpClient client = HttpClient.newHttpClient();

    @Nullable
    public HttpResponse<String> getMenuText() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL + "api/menu/"))
                .build();

        // Send our /api/menu request through HttpClient & return the response.
        try {
            return client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException exception) {
            exception.printStackTrace();
            return null;
        }
    }
}
