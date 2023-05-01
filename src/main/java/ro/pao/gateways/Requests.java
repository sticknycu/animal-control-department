package ro.pao.gateways;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

// Requirement 6 + 15
public class Requests {

    private static HttpClient httpClient = HttpClient.newHttpClient();

    private List<String> responseList = new ArrayList<>();

    public void saveRequestInfo() {

        try {

            HttpRequest httpRequestSpecies = HttpRequest.newBuilder()
                    .uri(new URI("https://apiv3.iucnredlist.org/api/v3/species/region/europe/page/0?token=9bb4facb6d23f48efbf424bb05c0c1ef1cf6f468393bc745d42179ac4aca5fee"))
                    .GET()
                    .build();

            HttpRequest httpRequestWeather = HttpRequest.newBuilder()
                    .uri(new URI("https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={88ed1a0bfb257da872a21bcda58c24bc}"))
                    .GET()
                    .build();

            var httpResponseSpecies = httpClient.send(httpRequestSpecies, HttpResponse.BodyHandlers.ofString());
            var httpResponseWeather = httpClient.send(httpRequestWeather, HttpResponse.BodyHandlers.ofString());

            responseList.add(httpResponseSpecies.body());
            responseList.add(httpResponseWeather.body());

            System.out.println(httpResponseSpecies.body());
            System.out.println(httpResponseWeather.body());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
