package com.exemplo.abrigosanimais.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "animais")
public class Animal {
    @Id
    private String id;
    private String nome;
    private String especie;
    private String idade;
    private String tamanho;
    private String idAbrigo;

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    public String getIdade() { return idade; }
    public void setIdade(String idade) { this.idade = idade; }
    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }
    public String getIdAbrigo() { return idAbrigo; }
    public void setIdAbrigo(String idAbrigo) { this.idAbrigo = idAbrigo; }
}
