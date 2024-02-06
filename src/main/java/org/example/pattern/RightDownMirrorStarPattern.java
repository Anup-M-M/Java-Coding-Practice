package org.example.pattern;

//        * * * * *
//          * * * *
//            * * *
//              * *
//                *

public class RightDownMirrorStarPattern {

    public static void main(String[] args) {
        int num=5, i ,j;

        for(i=1;i<=num;i++){
            for(j=1;j<i;j++){
                System.out.print("  ");
            }
            for(j=i;j<=num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
