package org.example.pattern;

//                 *
//               * *
//             * * *
//           * * * *
//         * * * * *

public class LeftTrianglePattern {
    public static void main(String[] args) {

        int row = 5;

        //Outer loop work for rows
        for (int i = 1; i <= row; i++) {
            //inner loop work for space or if we don't use equal to sign to remove one extra space at start.
            for (int j=i;j<=row;j++) {
                System.out.print("  ");
            }
            // To remove one extra space at start
//            for (int j = row - i; j >= 1; j--) {
//                System.out.print("  ");
//            }
            //inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
