package org.example.string;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String name= "An up";

        int len= name.length();

//        for(int i = len-1; i>=0; i-- ){
//            System.out.print(name.charAt(i));
//        }

        StringBuffer str= new StringBuffer();

        char[] chars = name.toCharArray();

        for (int i = len-1; i>=0; i--){
            str.append(chars[i]);
        }
        System.out.println(str);
    }
}
