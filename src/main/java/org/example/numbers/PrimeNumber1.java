package org.example.numbers;

//Prime number is a number that is greater than 1 and divided by 1 or itself only.
//In other words, prime numbers can't be divided by other numbers than itself or 1.

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if(isPrimeNumber(num))
            System.out.println(" Number is Prime Number");
        else
            System.out.println("Number is not Prime Number");
    }

    private static boolean isPrimeNumber(int num) {
        int i;
        double number = Math.sqrt(num);
        if (num<=1)
            return false;

        for(i=2;i<number;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
