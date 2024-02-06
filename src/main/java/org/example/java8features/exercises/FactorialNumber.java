package org.example.java8features.exercises;

import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

//Calculate factorial of number using Lambda expression
public class FactorialNumber {

    public static void main(String[] args) {

        IntUnaryOperator factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        int n = 7;
        int factorial_result = factorial.applyAsInt(n);

        // Print the factorial result
        System.out.println("Factorial of " + n + " is: " + factorial_result);
    }
}
