package com.exemplo.abrigosanimais.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "adocoes")
public class Adocao {
    @Id
    private String id;
    private String idAnimal;
    private String idAdotante;

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getIdAnimal() { return idAnimal; }
    public void setIdAnimal(String idAnimal) { this.idAnimal = idAnimal; }
    public String getIdAdotante() { return idAdotante; }
    public void setIdAdotante(String idAdotante) { this.idAdotante = idAdotante; }
}
