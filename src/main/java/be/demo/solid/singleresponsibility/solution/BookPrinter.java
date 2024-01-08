package be.demo.solid.singleresponsibility.solution;

public class BookPrinter {

    // methods for outputting text
    void printTextToConsole(String text){
        System.out.println(text);
    }

    void printTextToAnotherMedium(String text){
        // code for writing to any other location..
    }
}