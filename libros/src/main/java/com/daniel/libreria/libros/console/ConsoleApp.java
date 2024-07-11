package com.daniel.libreria.libros.console;

import com.daniel.libreria.libros.api.GutendexAPI;
import com.daniel.libreria.libros.api.JsonParserUtil;
import com.daniel.libreria.libros.service.BookService;
import com.daniel.libreria.libros.repository.BookRepository;
import com.daniel.libreria.libros.models.Author;
import com.daniel.libreria.libros.models.Book;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ConsoleApp {
    private static BookService bookService;

    public static void main(String[] args) {
        GutendexAPI api = new GutendexAPI();
        JsonParserUtil parser = new JsonParserUtil();
        BookRepository repository = new BookRepository();
        bookService = new BookService(api, parser, repository);

        runApp();
    }

    private static void runApp() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Buscar libro por título");
            System.out.println("2. Ver todos los libros");
            System.out.println("3. Ver libros por idioma");
            System.out.println("4. Ver todos los autores");
            System.out.println("5. Salir");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String title = scanner.nextLine();
                    try {
                        Book book = bookService.searchAndSaveBookByTitle(title);
                        System.out.println("Título: " + book.getTitle());
                        System.out.println("Autor: " + book.getAuthor().getName());
                        System.out.println("Idioma: " + book.getLanguage());
                        System.out.println("Número de Descargas: " + book.getDownloadCount());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    List<Book> allBooks = bookService.getAllBooks();
                    allBooks.forEach(book -> System.out.println(book.getTitle() + " - " + book.getAuthor().getName() + " - " + book.getLanguage() + " - " + book.getDownloadCount() + " descargas"));
                    break;
                case 3:
                    System.out.print("Ingrese el idioma: ");
                    String language = scanner.nextLine();
                    List<Book> booksByLanguage = bookService.getBooksByLanguage(language);
                    booksByLanguage.forEach(book -> System.out.println(book.getTitle() + " - " + book.getAuthor().getName() + " - " + book.getLanguage() + " - " + book.getDownloadCount() + " descargas"));
                    break;
                case 4:
                    List<Author> allAuthors = bookService.getAllAuthors();
                    allAuthors.forEach(author -> System.out.println(author.getName() + " - " + author.getBirthYear() + " - " + author.getDeathYear()));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
