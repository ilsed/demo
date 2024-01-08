package be.demo.solid.singleresponsibility.solution;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private BookPrinter bookPrinter;

    private List<Book> bookCollection = new ArrayList<>();

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
