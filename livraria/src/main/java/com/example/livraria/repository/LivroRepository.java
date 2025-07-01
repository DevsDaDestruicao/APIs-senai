package com.example.livraria.repository;

import com.example.livraria.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface responsavel por acessar o banco de dados.
 * Estende JpaRepository, o que fornece automaticamente
 * métodos prontos para operações CRUD (Create, Read. Update, Delete).
 */
public interface LivroRepository extends JpaRepository<Livro, Long> {

    // Nenhum método adicional é necessário por enquanto
    // A JpaRepository já fornece:
    // - findAll()
    // - findById(Long id)
    // - save(Livro livro)
    // - deleteById(Long id)
    // - existsById(Long id)
    // - count()
}
