package org.example.numbers;

//Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
//It is also known as pluperfect, or Plus Perfect, or Narcissistic number.

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.print("Armstrong ");
        } else {
            System.out.print("Not Armstrong ");
        }

    }

    static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;

        temp = n;

        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {

            last = temp % 10;

            sum += (int) Math.pow(last, digits);

            temp = temp / 10;
        }

        return n == sum;
    }
}
