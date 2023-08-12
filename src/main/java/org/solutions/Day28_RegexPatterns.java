package org.solutions;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Day28_RegexPatterns {

    /**
     * Problem Statement -
     * [Regex Patterns](https://www.hackerrank.com/challenges/30-regex-patterns)
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        Pattern pattern = Pattern.compile("[a-z.]+@gmail.com");
        ArrayList<String> array = new ArrayList<>();
        IntStream.range(0, n).forEach(NItr -> {
            String[] firstMultipleInput = scanner.nextLine().replaceAll("\\s+$", "").split(" ");
            String firstName = firstMultipleInput[0];
            String emailID = firstMultipleInput[1];

            Matcher matcher = pattern.matcher(emailID);
            if (matcher.find())
                array.add(firstName);
        });
        scanner.close();
        Collections.sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
}