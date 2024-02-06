package org.example.java8features.exercises;

import java.util.function.Predicate;

// check Palindrome string using lambda expression
public class CheckStringPalindrome {

    public static void main(String[] args) {

//        Predicate<String> isPalindrome = new Predicate<String>() {
//            @Override
//            public boolean test(String str) {
//                String reversed = new StringBuffer(str).reverse().toString();
//
//                return str.equals(reversed);
//            }
//        };

        Predicate<String> isPalindrome = str -> {
                String reversed = new StringBuffer(str).reverse().toString();
                return str.equals(reversed);
            };

        String str = "madam";

        boolean isPalindromeResult = isPalindrome.test(str);

        if(isPalindromeResult)
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is a not palindrome");
    }
}
