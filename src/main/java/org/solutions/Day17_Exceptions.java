package org.solutions;

import java.util.Scanner;

public class Day17_Exceptions {

    /**
     * Problem Statement -
     * [Exceptions](https://www.hackerrank.com/challenges/30-more-exceptions)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        Calculator calculator = new Calculator();
        while (n > 0) {
            try {
                String[] numbers = scanner.nextLine().trim().split(" ");
                System.out.println(calculator.power(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1])));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            n--;
        }
        scanner.close();
    }
}

class Calculator {

    public Integer power(Integer n, Integer p) throws Exception {
        if (n < 0 || p < 0)
            throw new Exception("n and p should be non-negative");
        return (int) (Math.pow(n, p));
    }
}