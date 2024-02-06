package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesElements {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 7, 3, 4, 2, 7, 8, 8, 3);

        List<Integer> listWithoutDuplicates = new ArrayList<>();

        for (int element : list) {
         // contains method Returns true if this list contains the specified element.
            if (!listWithoutDuplicates.contains(element)) {
                listWithoutDuplicates.add(element);
            }
        }

        System.out.println("List without duplicates:");
        for (int element : listWithoutDuplicates) {
            System.out.println(element);
        }
    }
}
