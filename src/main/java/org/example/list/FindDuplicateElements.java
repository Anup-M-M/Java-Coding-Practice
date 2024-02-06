package org.example.list;

import java.util.*;

// Find the duplicate elements in a list without using set

public class FindDuplicateElements {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 2, 7, 8, 8, 3);

        List<Integer> listWithoutDuplicates = new ArrayList<>();

        // Iterate over the list and compare each element with the rest of the elements
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (Objects.equals(list.get(i), list.get(j))) { // list.get(i) == list.get(j)
//                    System.out.println(list.get(i));
//                }
//            }
//        }

        System.out.println("\nFind duplicate elements in a list using contains method");

        for (Integer element : list) {
            // Returns true if this list contains the specified element.
            if (!listWithoutDuplicates.contains(element)) {
                listWithoutDuplicates.add(element);
            }else {
                System.out.println(element);
            }
        }

    }

}
