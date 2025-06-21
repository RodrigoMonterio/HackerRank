package com.monterio.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-1d-array-introduction/problem
public class Java1DArray {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();
        var numbers = new ArrayList<>();

        for(var i = 0; i < n; i++) {
            numbers.add(input.nextInt());
        }

        input.close();

        for(var num : numbers){
            System.out.println(num);
        }
    }
}