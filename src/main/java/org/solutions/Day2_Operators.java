package org.solutions;

import java.util.Scanner;

public class Day2_Operators {
    /**
     *
     * Problem Statement -
     * [Hello, World](https://www.hackerrank.com/challenges/30-hello-world)
     *
     */
    public static void main(String[] args) {
        double meal_cost;
        int tip_percent;
        int tax_percent;
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        meal_cost = Double.parseDouble(text);
        text = scan.nextLine();
        tip_percent = Integer.parseInt(text);
        text = scan.nextLine();
        tax_percent = Integer.parseInt(text);
        scan.close();
        System.out.println((int)meal_cost + Math.round(meal_cost/100*tip_percent) + Math.round(meal_cost/100*tax_percent));
    }
}