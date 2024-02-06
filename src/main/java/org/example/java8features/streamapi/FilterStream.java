package org.example.java8features.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterStream {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(6,4,3,8,11,9);

        data.stream()
                // Returns a new stream consisting of the elements of this stream that match the given predicate.
                .filter(n -> n % 2 == 1)
                .forEach(n -> System.out.println(n));

//     // Represents a predicate (boolean-valued function) of one argument.
//        Predicate<Integer> predicate= new Predicate<Integer>() {
//            @Override
//         // Evaluates this predicate on the given argument.
//         // Returns: true if the input argument matches the predicate, otherwise false
//            public boolean test(Integer n) {
//                return n % 2 == 1;
//            }
//        };
//
//        data.stream()
//                .filter(predicate)
//                .forEach(n -> System.out.println(n));

    }
}
