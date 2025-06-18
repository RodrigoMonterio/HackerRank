package com.monterio.strings;

import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-anagrams/problem
public class JavaAnagrams {

    public static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        return Arrays.equals(a.chars().sorted().toArray(), b.chars().sorted().toArray());
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
