package be.demo.solid.dependencyinversion.solution;

import java.util.LinkedList;
import java.util.List;

public class BookInMemoryPrinter implements BookPrinter {
    List<String> inMemoryList = new LinkedList<>();

    @Override
    public void print(String text) {
        inMemoryList.add(text);
    }

    public List<String> getInMemoryList() {
        return inMemoryList;
    }
}
