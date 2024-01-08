package be.demo.solid.dependencyinversion.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LibraryTest {
    private Library library;

    @Test
    public void testPrintShortSummaryToConsole() {
        BookPrinter bookPrinter = new BookConsolePrinter();
        library = new Library(bookPrinter);

        Book refactoringBook = new Book("Refacoring", "Martin Fowler", "Chapter one, chapter two", "The best book to learn about refactoring");

        library.addBook(refactoringBook);
        library.printShortSummary(refactoringBook);
    }

    @Test
    public void testPrintShortSummaryInMemorhy() {
        BookInMemoryPrinter inMemoryPrinter = new BookInMemoryPrinter();
        library = new Library(inMemoryPrinter);

        Book refactoringBook = new Book("Refactoring", "Martin Fowler", "Chapter one, chapter two", "The best book to learn about refactoring");

        library.addBook(refactoringBook);
        library.printShortSummary(refactoringBook);

        assertNotNull(inMemoryPrinter.getInMemoryList());
        assertEquals(inMemoryPrinter.getInMemoryList().get(0), "The best book to learn about refactoring");
    }
}
