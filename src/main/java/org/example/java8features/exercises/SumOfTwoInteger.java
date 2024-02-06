package org.example.java8features.exercises;

// Java program to implement a lambda expression to find the sum of two integers.

@FunctionalInterface
interface A{
    int sum(int x, int y);
}

public class SumOfTwoInteger {
    public static void main(String[] args) {

        A obj= (x, y) -> x+y;

        int result= obj.sum(6,7);

        System.out.println(result);

    }
}
