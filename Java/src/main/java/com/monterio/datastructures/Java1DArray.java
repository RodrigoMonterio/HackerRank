package com.monterio.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/java-1d-array-introduction/problem
public class Java1DArray {

    public static void main(String[] args) throws IOException {
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        var n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> str = new ArrayList<>();
        for (var i = 0; i < n; i++) {
            var line = bufferedReader.readLine();
            if (line != null && !line.trim().isEmpty()) {
                str.addAll(Arrays.asList(line.trim().split("\\s+")));
            }
        }

        str.stream().map(Integer::parseInt).forEach(System.out::println);
        bufferedReader.close();
    }
}