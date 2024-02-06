package org.example.java8features.exercises;

import java.util.Arrays;
import java.util.List;

//Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
public class UppercaseAndLowercase {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("Anup", "Rashmi", "Arun");

        names.replaceAll(name -> name.toUpperCase());

        System.out.println("Uppercase strings:");
        for (String str : names) {
            System.out.println(str);
        }

        names.replaceAll(String::toLowerCase);

        System.out.println("\nlowercase strings:");
        for (String str : names) {
            System.out.println(str);
        }


    }
}
