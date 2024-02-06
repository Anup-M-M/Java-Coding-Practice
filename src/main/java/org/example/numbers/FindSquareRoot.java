package org.example.numbers;

import java.util.Scanner;

// Find Square Root of a Number Without sqrt Method

public class FindSquareRoot {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The square root of " + n + " is: " + squareRoot(n));
    }

    public static double squareRoot(int num) {
        double t;
        double sqrtroot = (double) num / 2;
        do {
            t = sqrtroot;
            System.out.println(t);
            sqrtroot = (t + (num / t)) / 2;
            System.out.println(sqrtroot);
        }
        while ((t - sqrtroot) != 0);
        return sqrtroot;
    }
}
