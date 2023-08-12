package org.solutions;

import java.util.Scanner;

public class Day26_NestedLogic {

    /**
     * Problem Statement -
     * [Nested Logic](https://www.hackerrank.com/challenges/30-nested-logic)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] returnDate = scanner.nextLine().trim().split(" ");
        String[] dueDate = scanner.nextLine().trim().split(" ");
        scanner.close();
        int daysLate = Integer.parseInt(returnDate[0]) - Integer.parseInt(dueDate[0]);
        int monthsLate = Integer.parseInt(returnDate[1]) - Integer.parseInt(dueDate[1]);
        int yearsLate = Integer.parseInt(returnDate[2]) - Integer.parseInt(dueDate[2]);
        System.out.println(calculateFine(yearsLate, monthsLate, daysLate));
    }

    public static int calculateFine(int y, int m, int d) {
        if (y >= 1)
            return 10000;
        else if (m >= 1 && y == 0)
            return m * 500;
        else if (d >= 1 && m == 0)
            return 15 * d;
        return 0;
    }
}