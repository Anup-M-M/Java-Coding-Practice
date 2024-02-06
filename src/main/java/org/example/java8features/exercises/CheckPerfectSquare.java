package org.example.java8features.exercises;

// check if a given number is a perfect square.

import java.util.function.Predicate;

public class CheckPerfectSquare {

    public static void main(String[] args) {

        Predicate< Integer > isPerfectSquare = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        int num = 36;
        boolean result = isPerfectSquare.test(num);

        if(result)
            System.out.println(num + " is a perfect square");
        else
            System.out.println(num + " is not a perfect square");

    }
}
