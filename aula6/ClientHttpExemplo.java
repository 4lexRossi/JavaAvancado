package aula6;

import java.net.http.HttpRequest;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.URI;
import java.net.HttpResponse;

public class ClientHttpExemplo {
    public static void main(String[] args) throws IOException, InterruptedException {
        connectAndPrintURLJavaOracle();
    }

    private static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build();
        HttpClient httpClient = HttpClient().newhttpClient();
        HttpResponse<String> response = HttpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code::"+response.statusCode());
        System.out.println("Headers response::"+response.headers());
        System.out.println(response.body());
    }
}