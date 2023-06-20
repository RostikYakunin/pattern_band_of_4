package org.example.patterns.creational.signleton.multitone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookShelfMultitone {
    private final List<Book> bookList;
    private static final Map<String, BookShelfMultitone> instance = new HashMap<>();
    private String genre;

    private BookShelfMultitone(String genre) {
        this.bookList = new ArrayList<>();
        this.genre = genre;
    }

    public static BookShelfMultitone getInstance (String genre) {
        if (! instance.containsKey(genre)) {
            instance.put(genre, new BookShelfMultitone(genre));
        }

        return instance.get(genre);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void addBook (Book book) {
        bookList.add(book);
    }
    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public String toString() {
        return "BookShelfMultitone{" +
                "bookList=" + bookList +
                ", genre='" + genre + '\'' +
                '}';
    }
}
