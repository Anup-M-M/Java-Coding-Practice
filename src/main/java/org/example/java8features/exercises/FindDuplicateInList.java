package org.example.java8features.exercises;

import java.util.*;
import java.util.stream.Collectors;

//Find the duplicate elements in a list

public class FindDuplicateInList {

    public static void main(String[] args) {

        System.out.println("\nfind duplicate by set add ");

        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

        Set<Integer> results = findDuplicateBySetAdd(list);

        results.forEach(System.out::println);

        System.out.println("\nfind duplicate by frequency");

        List<Integer> list1 = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

        Set<Integer> result1 = findDuplicateByFrequency(list);

        result1.forEach(System.out::println);

    }



    private static Set<Integer> findDuplicateBySetAdd(List<Integer> list) {

        Set<Integer> set = new HashSet<>();

        return list.stream()
                // Set.add() returns false if the element was already in the set
                    .filter(n -> !set.add(n))
                    .collect(Collectors.toSet());
    }

    private static Set<Integer> findDuplicateByFrequency(List<Integer> list) {

        // It compares each item with a list – Collections.frequency(list, n)
        return list.stream().filter(n -> Collections.frequency(list, n) > 1)
                .collect(Collectors.toSet());
    }
}
