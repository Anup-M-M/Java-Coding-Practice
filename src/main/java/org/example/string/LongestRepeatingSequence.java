package org.example.string;

// find the longest repeating sequence in a string.

// need to find the substring which has been repeated in the original string more than once.

public class LongestRepeatingSequence {
    public static String lcp(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0, i);
            }
        }
        return s1.substring(0, n);
    }

    public static void main(String[] args) {
        String str = "acbdfghybdf";
        String lrs = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                //Checks for the largest common factors in every substring
                String x = lcp(str.substring(i, n), str.substring(j, n));
                //If the current prefix is greater than previous one
                //then it takes the current one as longest repeating sequence
                if (x.length() > lrs.length())
                    lrs = x;
            }
        }
        System.out.println("Longest repeating sequence: " + lrs);
    }
}