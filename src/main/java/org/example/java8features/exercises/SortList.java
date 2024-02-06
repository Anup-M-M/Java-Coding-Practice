package org.example.java8features.exercises;

import java.util.Arrays;
import java.util.List;

// Java program to implement a lambda expression to sort a list of strings in alphabetical order
public class SortList {

    public static void main(String[] args) {

        List<String> colors = Arrays.asList("red", "Green", "Blue", "black", "ink");

//      Compares two strings lexicographically, ignoring case differences.
        colors.sort(String::compareToIgnoreCase);

        System.out.println("\nSorted strings using compareToIgnoreCase : ");
        for (String str : colors) {
            System.out.print(str + ' ');
        }

        System.out.println();

//      Compares two strings lexicographically. The comparison is based on the Unicode value of each character in the strings.
        colors.sort(String::compareTo); // (str1, str2)->str1.compareTo(str2)
        System.out.println("\nSorted strings using compareTo : ");
        for (String str : colors) {
            System.out.print(str + ' ');
        }
    }
}
