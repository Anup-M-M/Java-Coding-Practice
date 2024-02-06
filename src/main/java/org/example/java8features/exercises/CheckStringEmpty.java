package org.example.java8features.exercises;

import java.util.function.Predicate;

//Java program to implement a lambda expression to check if a given string is empty.

public class CheckStringEmpty {

    public static void main(String[] args) {

        String str1 = "";

        String str2 = "anup";

        Predicate<String> isEmptyString = String::isEmpty; // name -> name.isEmpty()

        System.out.println("String 1 is empty: " + isEmptyString.test(str1));

        System.out.println("String 2 is empty: " + isEmptyString.test(str2));

//        Predicate<String> obj = new Predicate<String>() {
//            @Override
//            public boolean test(String name) {
//                return name.isEmpty();
//            }
//        };
//
//        System.out.println("String 1 is empty: "+ obj.test(str1));
    }
}
