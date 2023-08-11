package org.solutions;

import java.util.Scanner;

public class Day16_Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();
        try {
            System.out.println(Integer.parseInt(line));
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
