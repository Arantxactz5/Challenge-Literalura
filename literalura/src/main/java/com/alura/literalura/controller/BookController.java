package com.alura.literalura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alura.literalura.model.Book;
import com.alura.literalura.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    
}
