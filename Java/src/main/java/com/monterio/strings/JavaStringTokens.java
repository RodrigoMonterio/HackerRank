package com.monterio.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // start Write your code here.]
        String regScan = Pattern.compile("[!,?._'@]+").toString();
        String cleanS = s.replaceAll(regScan, " ");
        Pattern regS = Pattern.compile("(^$|\\s+)");
        String[] tokens = regS.split(cleanS.trim());
        System.out.println(tokens[0].equals("") ? "0" : tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
        // end Write your code here.
        scan.close();
    }
}
