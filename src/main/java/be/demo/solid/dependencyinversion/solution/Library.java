package be.demo.solid.dependencyinversion.solution;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private BookPrinter bookPrinter;

    private List<Book> bookCollection = new ArrayList<>();

    public Library(BookPrinter bookPrinter) {
        this.bookPrinter = bookPrinter;
    }

    public void addBook(Book aBook) {
        bookCollection.add(aBook);
    }

    public void printShortSummary(Book aBook) {
        String shortSummary = aBook.getShortSummary();
        bookPrinter.print(shortSummary);
    }
}
