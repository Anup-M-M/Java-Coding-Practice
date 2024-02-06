package org.example.numbers;

//Prime number is a number that is greater than 1 and divided by 1 or itself only.
//In other words, prime numbers can't be divided by other numbers than itself or 1.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i = 2;
        double sqrtOfNum = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();

        sqrtOfNum = Math.sqrt(num);

        boolean isPrime = true;

        if (num <= 1) {
            System.out.println("Number is not Prime Number");
        } else {
            for (i = 2; i < sqrtOfNum; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println("Number is Prime Number");
        else
            System.out.println("Number is not Prime Number");
    }
}
