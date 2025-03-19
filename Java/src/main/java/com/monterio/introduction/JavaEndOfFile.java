package com.monterio.introduction;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int line = 1;

        while(input.hasNext()) {
            String output = input.nextLine();
            System.out.println(line + " " + output);
            line++;
        }
        input.close();
    }
}