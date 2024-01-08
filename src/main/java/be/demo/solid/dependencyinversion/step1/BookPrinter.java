package be.demo.solid.dependencyinversion.step1;

public class BookPrinter {

    // methods for outputting text
    void printTextToConsole(String text) {
        System.out.println(text);
    }

    void printTextToAnotherMedium(String text) {
        // code for writing to any other location..
    }
}