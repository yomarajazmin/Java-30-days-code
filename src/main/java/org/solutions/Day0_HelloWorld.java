package org.solutions;

import java.util.Scanner;

public class Day0_HelloWorld {
    /**
     *
     * Problem Statement -
     * [Hello, World](https://www.hackerrank.com/challenges/30-hello-world)
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        scan.close();
        System.out.println("Hello, world.");
        System.out.println(text);
    }
}