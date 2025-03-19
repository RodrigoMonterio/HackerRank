package com.monterio.bignumber;

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }

        sc.close();

        //Write your code here
        s = Arrays.stream(s).filter(Objects::nonNull).toArray(String[]::new);
        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                BigDecimal n1 = new BigDecimal(x);
                BigDecimal n2 = new BigDecimal(y);
                return n1.compareTo(n2);
            }
        }));

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}