package org.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day9_Recursion {

    /**
     * Problem Statement -
     * [Recursion](https://www.hackerrank.com/challenges/30-recursion)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine().trim());
        scan.close();
        System.out.println(Result.factorial(n));
    }

    static class Result {
        public static int factorial(int n) {
            if (n>1)
                return n * factorial(n-1);
            return 1;
        }
    }
}
