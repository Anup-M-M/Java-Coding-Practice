package org.example.java8features.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(6,4,3,8,9);

        // creating the Stream
//        Stream<Integer> data = nums.stream();

        // count elements in Stream
//        long count = data.count();
//        System.out.println(count);

        // sort the Stream
//        Stream<Integer> sortedData= data.sorted();
//        sortedData.forEach(n -> System.out.println(n));

        int result = nums.stream()
                        .filter(n -> n%2==0) // Returns a new stream consisting of the elements of this stream that match the given predicate.
                        .sorted() //Returns a stream consisting of the elements of this stream, sorted according to natural order.
                        .map(n -> n*2) // map pass the value and perform operation on that value, Returns a new stream consisting of the results of applying the given function to the elements of this stream.
                        .reduce(0, (c,e) -> c+e);

        System.out.println(result);


    }
}
