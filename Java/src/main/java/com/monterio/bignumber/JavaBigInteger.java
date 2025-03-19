package com.monterio.bignumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaBigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BigInteger a = new BigInteger(reader.readLine());
            BigInteger b = new BigInteger(reader.readLine());

            if(!(a.signum() == 0 && a.signum() == -1)
                    && String.valueOf(a.intValue()).length() <= 200
                    && !(b.signum() == 0
                    && b.signum() == -1)
                    && String.valueOf(b.intValue()).length() <= 200){
                System.out.println(a.add(b));
                System.out.println(a.multiply(b));
            }
            reader.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
