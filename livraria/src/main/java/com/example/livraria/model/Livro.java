package com.example.livraria.model;

import jakarta.persistence.*;
import lombok.Data; // Gera automaticamente todos os métodos "boilerplate" (Getters, Setters, etc.)

@Data
@Entity // Indica que essa classe é uma entidade JPA, ou seja, será mapeada para uma tabela no banco de dados
public class Livro {

    @Id // Indica que esse campo é uma chave primaria da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define que o valor do ID será gerado automaticamente pelo banco de dados
    private Long id;

    private String titulo;
    private String autor;
    private int ano;

}
