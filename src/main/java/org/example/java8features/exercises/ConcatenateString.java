package org.example.java8features.exercises;

import java.util.function.BiFunction;

//Concatenate strings using Lambda expression
public class ConcatenateString {
    public static void main(String[] args) {

        BiFunction<String, String, String> concatenate = (str1, str2)-> str1+str2;

        String string1 = "Good ";
        String string2 = "Morning!";

        String result = concatenate.apply(string1, string2);

        System.out.println("\nConcatenated string: " + result);
    }
}
