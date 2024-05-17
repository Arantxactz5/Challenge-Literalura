package com.alura.literalura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alura.literalura.model.Author;
import com.alura.literalura.service.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    
}
