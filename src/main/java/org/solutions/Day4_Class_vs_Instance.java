package org.solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day4_Class_vs_Instance {
    /**
     * Problem Statement -
     * [Class vs Instance](https://www.hackerrank.com/challenges/30-class-vs-instance)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine().trim());
        int c = 0;
        int[] ages = new int[4];
        while (c < N) {
            ages[c] = Integer.parseInt(scan.nextLine().trim());
            c++;
        }
        scan.close();
        for (int i = 0; i < N; i++) {
            Person person = new Person(ages[i]);
            person.amIOld();
            person.yearPasses();
            person.yearPasses();
            person.yearPasses();
            person.amIOld();
            System.out.println();
        }
    }

    static class Person {
        private int initialAge;

        public Person(int initialAge) {
            if (initialAge > 0)
                this.initialAge = initialAge;
            else {
                this.initialAge = 0;
                System.out.println("Age is not valid, setting age to 0.");
            }
        }

        public void yearPasses() {
            this.initialAge += 1;
        }

        public void amIOld() {
            if (this.initialAge >= 18)
                System.out.println("You are old.");
            else if (this.initialAge >= 13)
                System.out.println("You are a teenager.");
            else
                System.out.println("You are young.");

        }
    }
}
