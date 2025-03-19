package com.monterio.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static int B;
    public static int H;
    public static boolean flag;

    static{
        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();

        if(B <= 0 || H <= 0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else if(B <= 100 && H <= 100){
            flag = true;
        }
        input.close();
    }
}