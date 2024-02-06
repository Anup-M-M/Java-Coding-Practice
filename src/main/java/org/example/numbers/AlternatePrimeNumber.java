package org.example.numbers;


public class AlternatePrimeNumber {

    public static void main(String[] args) {
        int num = 20;
        System.out.print("Alternate prime numbers up to " + num + " are: ");
        printAlternatePrimeNumber(num);
    }

    static int checkPrime(int num) {
        int i, flag = 0;
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            return 1;
        else
            return 0;
    }

    static void printAlternatePrimeNumber(int n) {
        //if the value of temp variable is odd, we do not print the prime number
        //if the value of temp variable is even, we print the prime number
        int temp = 2;
        for (int num = 2; num <= n - 1; num++) {
            //checking the number is prime or not
            if (checkPrime(num) == 1) {
                //prints the prime number if temp is even
                if (temp % 2 == 0)
                    System.out.print(num + " ");
                //increments the temp variable by 1
                temp++;
            }
        }
    }
}
