package be.demo.solid.singleresponsibility.step1;

import be.demo.solid.singleresponsibility.solution.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> bookCollection = new ArrayList<>();

    public void addBook(Book aBook) {
        bookCollection.add(aBook);
    }

    public void printShortSummary(Book aBook) {
        // TO SOLVE
    }
}
