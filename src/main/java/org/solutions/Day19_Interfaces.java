package org.solutions;

import java.util.Scanner;

public class Day19_Interfaces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        CalculatorDay19 calculator = new CalculatorDay19();
        System.out.println("I implemented: " + calculator.getClass().getInterfaces()[0].getSimpleName());
        System.out.println(calculator.divisorSum(n));
        scanner.close();

    }
}

interface AdvancedArithmetic {

    public int divisorSum(int n);
}

class CalculatorDay19 implements AdvancedArithmetic {

    public int divisorSum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                total += i;
        }
        return total;
    }
}
