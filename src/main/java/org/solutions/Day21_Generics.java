package org.solutions;

import java.util.*;

public class Day21_Generics {

    /**
     * Problem Statement -
     * [Generics](https://www.hackerrank.com/challenges/30-generics)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        Integer[] firstArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            firstArray[i] = Integer.parseInt(scanner.nextLine().trim());
        }
        n = Integer.parseInt(scanner.nextLine().trim());
        String[] secondArray = new String[n];
        for (int i = 0; i < n; i++) {
            secondArray[i] = scanner.nextLine().trim();
        }
        scanner.close();
        GenericClass<Integer> g1 = new GenericClass<>();
        g1.printArray(firstArray);
        GenericClass<String> g2 = new GenericClass<>();
        g2.printArray(secondArray);
    }
}

class GenericClass<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
}