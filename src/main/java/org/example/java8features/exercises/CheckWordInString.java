package org.example.java8features.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// check if a list of strings contains a specific word.

public class CheckWordInString {

    public static void main(String[] args) {

        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");

        String searchColor = "Orange";

//        Predicate<String> containsWord = new Predicate<String>() {
//            @Override
//            public boolean test(String word) {
//                return word.equals(searchColor);
//            }
//        };

        Predicate<String> containsWord = word -> word.equals(searchColor);


   // anyMatch return true if any elements of the stream match the provided predicate
        boolean flag = colors.stream().anyMatch(containsWord);

        if(flag)
            System.out.println(searchColor + " present in the list");
        else
            System.out.println(searchColor + " not present in the list");
    }
}
