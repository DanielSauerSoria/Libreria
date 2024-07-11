package com.daniel.libreria.libros.api;



import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.daniel.libreria.libros.models.Book;

public class JsonParserUtil {
    public Book parseBook(String jsonResponse) {
        Gson gson = new Gson();
        JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
        return gson.fromJson(jsonObject.getAsJsonArray("results").get(0), Book.class);
    }
}




