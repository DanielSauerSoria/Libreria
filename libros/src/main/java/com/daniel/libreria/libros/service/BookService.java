package com.daniel.libreria.libros.service;

import com.daniel.libreria.libros.api.GutendexAPI;
import com.daniel.libreria.libros.api.JsonParserUtil;
import com.daniel.libreria.libros.models.Book;
import com.daniel.libreria.libros.models.Author;
import com.daniel.libreria.libros.repository.BookRepository;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private GutendexAPI api;
    private JsonParserUtil parser;
    private BookRepository repository;

    public BookService(GutendexAPI api, JsonParserUtil parser, BookRepository repository) {
        this.api = api;
        this.parser = parser;
        this.repository = repository;
    }

    public Book searchAndSaveBookByTitle(String title) throws IOException {
        String response = api.fetchBooksByTitle(title);
        Book book = parser.parseBook(response);
        repository.save(book);
        return book;  // Return the book for immediate display
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public List<Book> getBooksByLanguage(String language) {
        return repository.findByLanguage(language);
    }

    public List<Author> getAllAuthors() {
        return repository.findAll().stream()
                .map(Book::getAuthor)
                .collect(Collectors.toList());
    }
}
