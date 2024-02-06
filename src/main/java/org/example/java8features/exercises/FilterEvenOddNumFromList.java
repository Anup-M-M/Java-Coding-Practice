package org.example.java8features.exercises;

//Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEvenOddNumFromList {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(3,5,2,4,9,10);

        nums.stream()
                .filter(n -> n%2==0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        List<Integer> oddNumbers = nums.stream()
                .filter(n -> n%2==1)
                .toList(); // collect(Collectors.toList());

        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }

    }
}
