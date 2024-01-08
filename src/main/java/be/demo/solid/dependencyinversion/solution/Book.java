package be.demo.solid.dependencyinversion.solution;

public class Book {

    private final String name;
    private final String author;
    private final String text;
    private final String shortSummary;

    public Book(String name, String author, String text, String shortSummary) {
        this.name = name;
        this.author = author;
        this.text = text;
        this.shortSummary = shortSummary;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public String getShortSummary() {
        return shortSummary;
    }

    // methods that directly relate to the book properties
    public String replaceWordInText(String word, String replacementWord) {
        return text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word) {
        return text.contains(word);
    }
}