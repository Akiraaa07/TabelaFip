package com.example.TabelaFipe.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.List;

public class ConverteDados implements IConverteDados {

    // Cria um objeto ObjectMapper, que será usado para fazer a conversão de JSON para objeto Java
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            // Converte o texto JSON para um objeto do tipo passado como parâmetro (classe)
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            // Se der erro ao tentar ler o JSON (ex: JSON malformado), lança uma exceção genérica
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> List<T> obterLista(String json, Class<T> classe) {
        CollectionType lista = mapper.getTypeFactory().constructCollectionType(List.class, classe);

        try {
            return mapper.readValue(json, lista);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
