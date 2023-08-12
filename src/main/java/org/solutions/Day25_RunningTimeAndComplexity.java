package org.solutions;

import java.util.Scanner;

public class Day25_RunningTimeAndComplexity {

    /**
     * Problem Statement -
     * [Running Time And Complexity](https://www.hackerrank.com/challenges/30-running-time-and-complexity)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        int number, limit, i;
        boolean isPrime;
        while (n > 0) {
            number = Integer.parseInt(scanner.nextLine().trim());
            if(number==1)
                isPrime=false;
            else {
                i = 2;
                isPrime = true;
                limit = number / 2;
                while (i <= limit && isPrime) {
                    if (number % i == 0)
                        isPrime = false;
                    i++;
                }
            }
            if (isPrime)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
            n--;
        }
        scanner.close();
    }
}