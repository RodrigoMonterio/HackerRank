package com.monterio.exceptionhandling;

import java.util.Scanner;

public class JavaExceptionHandling {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(MyCalculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */
    public static String power(int n, int p ) throws Exception{
        String msg = "";
        if(n < 0 || p < 0){
            throw new Exception("n or p should not be negative.");
        }else if(n == 0 && p == 0){
            throw new Exception("n and p should not be zero.");
        }else if(n <= 10 && p <= 10){
            Double result = Math.pow(n, p);
            msg = String.valueOf(result.intValue());
        }
        return msg;
    }
}
