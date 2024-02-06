package org.example.string;

import java.util.Arrays;

// divide a string in 'N' equal parts.

public class DivideStringEqualPart {
    public static void main(String[] args) {
        String str = "aaaabbbbcccc";
        int length = str.length();
        int n = 3;
        int temp = 0, numChars = length/n;

        String[] equalString = new String [n];

        if( length % n != 0 ){
            System.out.println("String cannot be divided into "+ n +" equal parts.");
        }else {
            for(int i = 0; i < length ; i = i+numChars){
                String part = str.substring(i, i+numChars);
                equalString[temp] = part;
                temp++;
            }
        }

        System.out.println(Arrays.toString(equalString));
    }
}
