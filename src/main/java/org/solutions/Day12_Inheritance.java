package org.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day12_Inheritance {

    /**
     * Problem Statement -
     * [Inheritance](https://www.hackerrank.com/challenges/30-inheritance)
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String[] studentData = e.nextLine().trim().split(" ");
        int n = Integer.parseInt(e.nextLine().trim());
        String[] scoresReceived = e.nextLine().trim().split(" ");
        e.close();
        List<Integer> scores = new ArrayList<>();
        for (String score : scoresReceived) {
            scores.add(Integer.parseInt(score));
        }
        Student student = new Student(studentData[0], studentData[1], Integer.parseInt(studentData[2]), scores);
        System.out.println("Name: " + student.getLastName() + ", " + student.getFirstName());
        System.out.println("ID: " + student.getIdNumber());
        System.out.println("Grade: " + student.calculate());
    }

    static class Person {
        private String firstName;
        private String lastName;
        private int idNumber;

        Person(String fn, String ln, int id) {
            this.firstName = fn;
            this.lastName = ln;
            this.idNumber = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getIdNumber() {
            return idNumber;
        }
    }

    static class Student extends Person {
        private List<Integer> scores;

        Student(String fn, String ln, int id, List<Integer> scores) {
            super(fn, ln, id);
            this.scores = scores;
        }

        public char calculate() {
            int average = 0;
            for (int score : scores) {
                average = average + score;
            }
            average = average / scores.size();
            if (average >= 90)
                return 'O';
            else if (average >= 80)
                return 'E';
            else if (average >= 70)
                return 'A';
            else if (average >= 55)
                return 'P';
            else if (average >= 40)
                return 'D';
            else
                return 'T';
        }
    }
}
