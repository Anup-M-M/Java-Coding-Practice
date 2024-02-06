package org.example.java8features.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//find the maximum and minimum values in a list of integers.
public class FindMaxMinInList {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(12, 1, 5, -1, 0, 8, 7, 9, -6);

        Optional<Integer> max = nums.stream()
                                        .max(Integer::compareTo); // (x,y) -> x.compareTo(y)

        Optional<Integer> min = nums.stream()
                                        .min(Integer::compareTo);

        System.out.println("Maximum value: " + max.orElse(null));
        System.out.println("Minimum value: " + min.orElse(null));

    }
}
