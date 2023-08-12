package org.solutions;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Day29_BitwiseAnd {

    class Result {

        /*
         * Complete the 'bitwiseAnd' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER N
         *  2. INTEGER K
         */

        public static int bitwiseAnd(int N, int K) {
            int result = 0;
            for (int i = 1; i <= N; i++) {
                for (int j = i + 1; j <= N; j++) {
                    int partialResult = i & j;
                    if (partialResult > result && partialResult < K)
                        result = partialResult;
                }
            }
            return result;
        }
    }

    /**
     * Problem Statement -
     * [BitwiseAnd](https://www.hackerrank.com/challenges/30-bitwise-and)
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            String[] firstMultipleInput = scanner.nextLine().split(" ");

            int count = Integer.parseInt(firstMultipleInput[0]);

            int lim = Integer.parseInt(firstMultipleInput[1]);

            int res = Result.bitwiseAnd(count, lim);

            System.out.println(res);
        });
        scanner.close();
    }
}