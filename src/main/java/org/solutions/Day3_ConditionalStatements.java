package org.solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day3_ConditionalStatements {
    /**
     * Problem Statement -
     * [Conditional Statements](https://www.hackerrank.com/challenges/30-conditional-statements)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        if (N % 2 == 0) {
            if (2 <= N && N <= 4 || N > 20)
                System.out.println("Not Weird");
            else
                System.out.println("Weird");
        } else
            System.out.println("Weird");
    }
}