package org.solutions;

import java.util.Scanner;

public class Day10_BinaryNumbers {

    /**
     * Problem Statement -
     * [Binary Numbers](https://www.hackerrank.com/challenges/30-binary-numbers)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine().trim());
        scan.close();
        int numberOfOnes=0,maxConsecutiveOnes=0;
        int remainder;
        while (n>0){
            remainder=(n % 2);
            n=n/2;
            if(remainder==1) {
                numberOfOnes++;
                if (maxConsecutiveOnes < numberOfOnes)
                    maxConsecutiveOnes = numberOfOnes;
            }
            else
                numberOfOnes = 0;
        }
        System.out.println(maxConsecutiveOnes);
    }
}
