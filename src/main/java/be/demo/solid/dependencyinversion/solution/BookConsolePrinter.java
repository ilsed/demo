package be.demo.solid.dependencyinversion.solution;

public class BookConsolePrinter implements BookPrinter {
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
