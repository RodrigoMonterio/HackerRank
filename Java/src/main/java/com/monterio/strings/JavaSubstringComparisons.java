package com.monterio.strings;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaSubstringComparisons {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int k = input.nextInt();
        //String s = "welcometojava";
        //int k = 3;
        input.close();
        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        if (s == null || k <= 0 || k > s.length()) {
            throw new IllegalArgumentException("Parâmetros inválidos.");
        }

        return IntStream.rangeClosed(0, s.length() - k)
                .mapToObj(i -> s.substring(i, i + k))
                .collect(Collectors.teeing(
                        Collectors.minBy(String::compareTo),
                        Collectors.maxBy(String::compareTo),
                        (min, max) -> min.get() + "\n" + max.get()
                ));
    }

    public static String getSmallestAndLargestV1(String s, int k) {
        String smallest = "";
        String largest = "";


        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);
            if (current.compareTo(smallest) < 0) smallest = current;
            if (current.compareTo(largest) > 0) largest = current;
        }

        if(largest == "" && smallest == "") {
            System.out.println("Nao deu certo");
        }

        return smallest + "\n" + largest;
    }
    //String test = str;
    //System.out.println("DEBUG  -> var test " + test);
}