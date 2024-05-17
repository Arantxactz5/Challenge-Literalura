package com.alura.literalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alura.literalura.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    // Métodos de consulta personalizados (si es necesario)
}