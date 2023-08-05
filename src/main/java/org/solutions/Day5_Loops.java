package org.solutions;

import java.util.Scanner;

public class Day5_Loops {
    /**
     * Problem Statement -
     * [Class vs Instance](https://www.hackerrank.com/challenges/30-class-vs-instance)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine().trim());
        scan.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
