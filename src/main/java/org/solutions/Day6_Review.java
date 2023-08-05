package org.solutions;

import java.util.Scanner;

public class Day6_Review {
    /**
     * Problem Statement -
     * [Class vs Instance](https://www.hackerrank.com/challenges/30-class-vs-instance)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine().trim());
        int c = 0;
        StringBuilder even, odd;
        while (c < n) {
            char[] word = scan.nextLine().trim().toCharArray();
            even = new StringBuilder();
            odd = new StringBuilder();
            for (int i = 0; i < word.length; i++) {
                if (i % 2 == 0)
                    even.append(word[i]);
                else
                    odd.append(word[i]);
            }
            System.out.println(even + " " + odd);
            c++;
        }
        scan.close();
    }
}
