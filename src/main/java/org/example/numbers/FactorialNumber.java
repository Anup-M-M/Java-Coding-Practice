package org.example.numbers;

// Factorial of n is the product of all positive descending integers.

public class FactorialNumber {

   /* // Factorial Program using loop
    public static void main(String[] args) {

        int number= 5, i, fact=1;

        for(i=1;i<=number; i++){
            fact= fact*i;
        }

        System.out.println(fact);
    }*/

    // Factorial Program using recursion
    public static void main(String[] args) {

        int i, fact=1;
        int number = 5;
        fact = factorial(number);

        System.out.println("Factorial of " + number + " is "+ fact);

    }

    private static int factorial(int number) {
        if(number==1)
            return 1;
        else
            return number * factorial(number - 1);
    }
}
