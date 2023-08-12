package org.solutions;

import java.util.*;

public class Day18_QueuesStacks {

    /**
     * Problem Statement -
     * [Queues and Stacks](https://www.hackerrank.com/challenges/30-queues-stacks)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();
        scanner.close();
        char[] chars = line.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        int c = 0;
        while (c < chars.length) {
            pushCharacter(stack, chars[c]);
            enqueueCharacter(queue, chars[c]);
            c++;
        }
        boolean match = true;
        c = 0;
        while (c < chars.length / 2) {
            if (popCharacter(stack) != dequeueCharacter(queue)) {
                match = false;
                break;
            }
            c++;
        }
        if (match)
            System.out.println("The word, " + line + ", is a palindrome.");
        else
            System.out.println("The word, " + line + ", is not a palindrome.");
    }

    public static void pushCharacter(Stack<Character> stack, char ch) {
        stack.push(ch);
    }

    public static void enqueueCharacter(Queue<Character> queue, char ch) {
        queue.add(ch);
    }

    public static char popCharacter(Stack<Character> stack) {
        return stack.pop();
    }

    public static char dequeueCharacter(Queue<Character> queue) {
        return queue.poll();
    }
}