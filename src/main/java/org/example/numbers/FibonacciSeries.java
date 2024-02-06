package org.example.numbers;

public class FibonacciSeries {

   // fibonacci series program in java without using recursion.
//    public static void main(String[] args) {
//
//        int num1 = 0, num2=1, num3=0,i, count = 10;
//
//        System.out.print(num1+" "+ num2);
//
//        for(i=2;i<count;i++){
//            num3=num1+num2;
//            System.out.print(" "+ num3);
//            num1=num2;
//            num2=num3;
//        }
//    }

    // fibonacci series program in java using recursion.
    static int num1 = 0, num2=1, num3=0;

    public static void main(String[] args) {

        int count = 10;
        System.out.print(num1+" "+ num2);

        printFibonacciSeries(count-2);

    }

    private static void printFibonacciSeries(int count) {

        if(count>0){
            num3= num1+num2;
            num1=num2;
            num2=num3;

            System.out.print(" "+ num3);

            printFibonacciSeries(count-1);
        }
    }
}
