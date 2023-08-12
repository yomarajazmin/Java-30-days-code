package org.solutions;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day20_Sorting {

    /**
     * Problem Statement -
     * [Sorting](https://www.hackerrank.com/challenges/30-sorting)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        List<Integer> a = Stream.of(scanner.nextLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int numberOfSwaps = 0, aux, totalSwaps = 0;
        for (int i = 0; i < n; i++) {
            totalSwaps += numberOfSwaps;
            numberOfSwaps = 0;
            for (int j = 0; j < n - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    aux = a.get(j + 1);
                    a.set(j + 1, a.get(j));
                    a.set(j, aux);
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0)
                break;
        }

        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n - 1));
    }
}