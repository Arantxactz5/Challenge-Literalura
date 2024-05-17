package com.alura.literalura.client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("unused")
public class GutendexClient {
    private static final String BASE_URL = "https://gutendex.com/books/";

    public String buscarLibroPorTitulo(String titulo) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI(BASE_URL + "?search=" + titulo))
            .GET()
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
