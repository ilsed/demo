package be.demo.solid.dependencyinversion.step1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> bookCollection = new ArrayList<>();
    private BookPrinter bookPrinter;

    public Library() {
        this.bookPrinter = new BookPrinter();
    }

    public void addBook(Book aBook) {
        bookCollection.add(aBook);
    }

    public void printShortSummary(Book aBook) {
        String shortSummary = aBook.getShortSummary();
        bookPrinter.printTextToConsole(shortSummary);
    }
}
