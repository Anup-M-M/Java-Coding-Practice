package org.example.string;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        // The strip() method is the recommended way to remove whitespaces because it uses the Unicode standard.
        final String str1 = " grab ";
        System.out.println(str1.trim().equals(str1.strip())); // return --> true

        final String str2 = "  Grab \u2005";  // Unicode of white-space
        System.out.println(str2.trim().equals(str2.strip())); // return --> false

        final String str3 = "\t     Grab \r";
        System.out.println(str3.trim().equals(str3.strip())); // return --> true

        final String str4 = "\u2000";
        System.out.println(str4.trim().equals(str4.strip())); // return --> false

        System.out.println(" =========================== ");

        //The array returned by this method contains each substring of this String that is terminated by another substring that matches the given expression or is terminated by the end of the string.
        String[] st1=str1.split("g",2);
        System.out.println(Arrays.toString(st1));

    }
}
