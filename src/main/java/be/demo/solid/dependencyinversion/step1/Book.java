package be.demo.solid.dependencyinversion.step1;

/**
 * Let’s begin with the single responsibility principle. As we might expect, this principle states that a class should only have one responsibility. Furthermore, it should only have one reason to change.
 * <p>
 * How does this principle help us to build better software? Let’s see a few of its benefits:
 * <p>
 * Testing – A class with one responsibility will have far fewer test cases.
 * Lower coupling – Less functionality in a single class will have fewer dependencies.
 * Organization – Smaller, well-organized classes are easier to search than monolithic ones.
 */
public class Book {

    private String name;
    private String author;
    private String text;
    private String shortSummary;

    public Book(String name, String author, String text, String shortSummary) {
        this.name = name;
        this.author = author;
        this.text = text;
        this.shortSummary = shortSummary;
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