package org.example.java8features.exercises;

import java.util.Arrays;
import java.util.List;

// multiply and sum all elements in a list of integers
public class FIndSumAndMultiplyOfList {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 2, 3, 6, 5, 1);

        int sum = nums.stream()
                            .reduce(0, Integer::sum);

        System.out.println("\nSum of the list elements: " + sum);

        int result = nums.stream()
                            .reduce(1, (x, y) -> x * y);

        System.out.println("\nmultiply of the list elements: " + result);

    }
}
