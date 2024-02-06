package org.example.pattern;

//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

public class DecreasingTrianglePattern {
    public static void main(String[] args) {
        int num=5, i ,j;

        for(i=1; i<=num;i++){
            for(j=i;j<=num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
