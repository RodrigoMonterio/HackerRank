package com.monterio.introduction;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            boolean verifyInput = (t < 0 || t > 500) || (a < 0 || a > 50)
                    || (b < 0 || b > 50)
                    || (n < 1 || n > 15);

            if (verifyInput) {
                System.out.println("Please, follow the following rules: ");
                System.out.println("The firt number should need between 0 and 500!");
                System.out.println("The second and third number should need between 0 and 50!");
                System.out.println("The fourth  number should need between 1 and 15!");
                break;
            }

            String expression = createExpression(a, b, n);
            System.out.println(expression);
        }
        in.close();
    }

    private static String createExpression(int a, int b, int n) {
        int powerResul = 1;
        int expression = a + (powerResul * b);
        String msg = String.valueOf(expression);
        for (int i = 1; i < n; i++) {
            powerResul = powerResul * 2;
            expression = expression + (powerResul * b);
            msg = msg + " " + String.valueOf(expression);
        }
        return msg;
    }
}
