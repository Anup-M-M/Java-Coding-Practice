package org.example.java8features.exercises;

// lambda expression to count words in a sentence.
public class CountWordsInString {

    @FunctionalInterface
    interface WordCounter {
        int countWords(String text);
    }

    public static void main(String[] args) {
        String text = "Java lambda expression";
        WordCounter wordCounter = s -> s.split("\\s+").length;
        int count = wordCounter.countWords(text);
        System.out.println("Word count: " + count);

    }
}
