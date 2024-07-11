package com.daniel.libreria.libros.models;

import com.google.gson.annotations.SerializedName;

public class Author {
    @SerializedName("name")
    private String name;

    @SerializedName("birth_year")
    private int birthYear;

    @SerializedName("death_year")
    private int deathYear;

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }
}
