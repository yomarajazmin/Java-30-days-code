package org.solutions;

import java.util.Scanner;

public class Day7_Arrays {
    /**
     * Problem Statement -
     * [Arrays](https://www.hackerrank.com/challenges/30-arrays)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine().trim());
        String[] numbers = scan.nextLine().trim().split(" ");
        scan.close();
        for(int i=n-1;i>= 0;i--){
            System.out.print(numbers[i]+" ");
        }
    }
}
