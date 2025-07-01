package entities;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {

public Moeda buscaMoeda(String moeda) throws IOException, InterruptedException {
    URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + moeda + "/latest/USD");

    HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco)
            .build();

    HttpResponse<String> response = HttpClient // Aqui seria a resposta;
            .newHttpClient()
            .send(request, HttpResponse.BodyHandlers.ofString());
    return new Gson().fromJson(response.body(), Moeda.class);
}



}


//4983809db9e4382d06f84cb1 key