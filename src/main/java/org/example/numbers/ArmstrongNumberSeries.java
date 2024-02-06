package org.example.numbers;

// Prints all the Armstrong numbers up to the specified limit.
public class ArmstrongNumberSeries {

    public static void main(String[] args) {
        int num= 999;

        for (int i= 0; i<=num; i++){
            if(isArmStrongNumber(i))
                System.out.println(i + " ");
        }
    }

    private static boolean isArmStrongNumber(int num) {
        int temp = 0, digit=0, result=0, rem=0 ;

        temp= num;
        while(num>0){
            num=num/10;
            digit++;
        }

        num = temp;
        while(num>0){
            rem=num%10;
            result += (int) Math.pow(rem, digit);
            num=num/10;
        }

        return temp == result;
    }
}
