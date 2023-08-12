package org.solutions;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day27_Testing {

    /**
     * Problem Statement -
     * [Testing](https://www.hackerrank.com/challenges/30-testing)
     */
    public static void main(String[] args) throws Exception {
        TestDataEmptyArray testDataEmptyArray = new TestDataEmptyArray();
        TestDataUniqueValues testDataUniqueValues = new TestDataUniqueValues();
        TestDataExactlyTwoDifferentMinimums testDataExactlyTwoDifferentMinimums = new TestDataExactlyTwoDifferentMinimums();
        boolean allPassed = true;
        // Test with empty array
        try {
            minimum_index(testDataEmptyArray.get_array());
        } catch (IllegalArgumentException e) {
            allPassed = !e.getMessage().isEmpty();
        }

        // Test with unique values
        allPassed = allPassed && (testDataUniqueValues.get_expected_result() == minimum_index(testDataUniqueValues.get_array()));

        //Test with two different minimum
        allPassed = allPassed && (testDataExactlyTwoDifferentMinimums.get_expected_result() == minimum_index(testDataExactlyTwoDifferentMinimums.get_array()));
        if (allPassed)
            System.out.println("OK");
    }

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray {

        public int[] get_array() {
            return new int[]{};
        }
    }

    static class TestDataUniqueValues {
        public int[] get_array() {
            return new int[]{0, 1};
        }

        public int get_expected_result() {
            return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public int[] get_array() {
            return new int[]{0, 0, 1, 2};
        }

        public int get_expected_result() {
            return 0;
        }
    }
}