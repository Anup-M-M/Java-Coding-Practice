package org.example.list;

import java.util.HashSet;
import java.util.List;

// Find the duplicate elements in a list using set

public class FindDuplicateElementsUsingSet {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 2, 7, 8, 8, 3);

        HashSet<Integer> set = new HashSet<>();

        for (Integer element : list) {
            // Set.add() return true if this set did not already contain the specified element
            if (!set.add(element)) {
                System.out.println(element);
            }
        }
    }
}
