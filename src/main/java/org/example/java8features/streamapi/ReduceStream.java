package org.example.java8features.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ReduceStream {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6,15, 7, 8, 9, 10};
        int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(max);

        String[] strings = {"a", "b", "c", "d", "e"};

        // |a|b|c|d|e , the initial | join is not what we want
        String reduce = Arrays.stream(strings).reduce("", (a, b) -> a + "|" + b);
        System.out.println("reduce : "+ reduce);

        // a|b|c|d|e, filter the initial "" empty string
        String reduce2 = Arrays.stream(strings).reduce("", (a, b) -> {
            if (!"".equals(a)) {
                return a + "|" + b;
            } else {
                return b;
            }
        });
        System.out.println("reduce - "+ reduce2);


        // a|b|c|d|e , better uses the Java 8 String.join :)
        String join = String.join("|", strings);
        System.out.println("join : "+ join);

    }
}
