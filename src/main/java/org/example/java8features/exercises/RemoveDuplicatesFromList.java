package org.example.java8features.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Remove duplicates from list of integers using Lambda expression

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);

        System.out.println("List elements " + nums);

        List<Integer> unique_nums = new ArrayList<>();

        nums.stream()
                .distinct() // Returns a stream consisting of the distinct elements
                .forEach(unique_nums::add); // n -> unique_nums.add(n)

        System.out.println("\nList elements without duplicates: " + unique_nums);
    }
}
