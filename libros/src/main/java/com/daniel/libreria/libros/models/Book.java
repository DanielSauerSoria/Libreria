package com.daniel.libreria.libros.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Book {
    @SerializedName("title")
    private String title;

    @SerializedName("authors")
    private List<Author> authors;

    @SerializedName("languages")
    private List<String> languages;

    @SerializedName("download_count")
    private int downloadCount;

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return authors.get(0); // Asumimos que hay al menos un autor
    }

    public String getLanguage() {
        return languages.get(0); // Asumimos que hay al menos un idioma
    }

    public int getDownloadCount() {
        return downloadCount;
    }
}

