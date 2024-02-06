package org.example.java8features.exercises;

import java.util.function.Predicate;

//Check prime number using Lambda expression
public class CheckPrimeNumber {

    public static void main(String[] args) {

        Predicate<Integer> is_Prime = num -> {
            double number = Math.sqrt(num);
            if (num<=1)
                return false;

            for(int i=2;i<number;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        };

        int n=5;

        boolean isPrimeResult = is_Prime.test(n);

        if(isPrimeResult)
            System.out.println(n + " is prime number");
        else
            System.out.println(n + " is not prime number");
    }
}
