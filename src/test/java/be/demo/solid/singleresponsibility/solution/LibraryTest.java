package be.demo.solid.singleresponsibility.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void beforeEach() {
        library = new Library();
    }

    @Test
    public void testPrintShortSummary() {
        Book refactoringBook = new Book("Refactoring", "Martin Fowler", "Chapter one, chapter two", "The best book to learn about refactoring");

        library.addBook(refactoringBook);
        library.printShortSummary(refactoringBook);
    }
}
