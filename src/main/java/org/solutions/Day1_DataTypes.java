package org.solutions;

import java.util.Scanner;

public class Day1_DataTypes {
    /**
     * Problem Statement -
     * [Data Types](https://www.hackerrank.com/challenges/30-data-types)
     */
    public static void main(String[] args) {
        int i;
        double d;
        String s = "Line ";
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        i = Integer.parseInt(text);
        text = scan.nextLine();
        d = Double.parseDouble(text);
        text = scan.nextLine();
        scan.close();
        System.out.println(i + (int) d);
        System.out.println(d + d);
        System.out.println(s + text);
    }
}