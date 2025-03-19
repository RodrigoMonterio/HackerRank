package com.monterio.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);
        try{
            int x = input.nextInt();
            int y = input.nextInt();

            if(isIntValid(x) || isIntValid(y)){
                System.out.println(Math.floorDiv(x, y));
            }
        }catch(InputMismatchException e){
            System.out.println(e.getClass().getCanonicalName());
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        input.close();
    }

    public static boolean isIntValid(int n){
        int maxValue = 2147483647;
        int minValue = -2147483648;
        boolean isValidateInt = (n >= minValue && n <= maxValue);

        if(n == 0 || !isValidateInt){
            throw new ArithmeticException(": / by zero");
        }
        return isValidateInt;
    }
}