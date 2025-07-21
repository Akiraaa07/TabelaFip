package com.example.TabelaFipe.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

    // Método que faz uma requisição HTTP para o endereço (URL) informado e retorna o conteúdo da resposta como uma String (geralmente JSON).
    public String obterDados(String endereco) {

        // Cria um cliente HTTP que será usado para enviar a requisição
        HttpClient client = HttpClient.newHttpClient();

        // Cria uma requisição HTTP do tipo GET usando o endereço fornecido
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco)) // converte a String para um objeto URI
                .build(); // finaliza a construção da requisição

        // Declara a variável que irá guardar a resposta da requisição
        HttpResponse<String> response = null;

        // Envia a requisição e espera a resposta
        try {
            // Envia a requisição usando o cliente e armazena a resposta como String
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            // Se ocorrer erro de entrada/saída (como problemas de rede), lança uma exceção genérica
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            // Se a thread for interrompida durante a requisição, também lança exceção
            throw new RuntimeException(e);
        }

        // Extrai o corpo (conteúdo) da resposta recebida, geralmente um JSON
        String json = response.body();

        // Retorna esse conteúdo como resultado do método
        return json;
    }
}
