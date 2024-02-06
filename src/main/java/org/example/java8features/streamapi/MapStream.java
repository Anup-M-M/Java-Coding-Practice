package org.example.java8features.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapStream {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(6,4,3,8,11,9);

        data.stream()
                // Returns a stream consisting of the results of applying the given function to the elements of this stream.
                .map(n -> n*2)
                .forEach(n-> System.out.println(n));


//     // Represents a function that accepts one argument and produces a result.
//        Function<Integer, Integer> fun = new Function<Integer, Integer>() {
//            @Override
//         // Applies this function to the given argument.
//            public Integer apply(Integer n) {
//                return n*2;
//            }
//        };
//
//        data.stream()
//             // Returns a stream consisting of the results of applying the given function to the elements of this stream.
//                .map(fun)
//                .forEach(n-> System.out.println(n));


    }
}
