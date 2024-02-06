package org.example.list;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Remove the duplicate elements in a list using set

public class RemoveDuplicateElementsUsingSet {

    public static void main(String[] args) {

        System.out.println("\n Remove Duplicate Elements using Set");

        List<Integer> list = List.of(1, 2, 7, 3, 4, 2, 7, 8, 8, 3);

        Set<Integer> set = new HashSet<>(list); // or set.addAll(list);

        for (Integer element : set) {
            System.out.println(element);
        }
    }
}
