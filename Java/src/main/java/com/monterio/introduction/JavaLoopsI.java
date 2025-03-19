package com.monterio.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

public class JavaLoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> multiplicationTable = IntStream.rangeClosed(1, 10)
                .boxed()
                .toList();

        multiplicationTable.stream()
                .map(multiplier -> multiplier * N)
                .forEachOrdered(result -> System.out.println(N + " x " + Math.floorDiv(result, N) + " = " + result));

        bufferedReader.close();
    }
}
