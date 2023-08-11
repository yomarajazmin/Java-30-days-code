package org.solutions;

import java.util.Scanner;

public class Day15_LinkedList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int element = scanner.nextInt();
        Node head = insert(null, element);
        Node initialPointer = head;
        while (n > 1) {
            element = scanner.nextInt();
            head = insert(head, element);
            n--;
        }
        scanner.close();

        head = initialPointer;
        while (head != null) {
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
    }

    public static Node insert(Node head, int data) {
        if (head == null)
            return new Node(data);

        if (head.getNext() == null)
            head.setNext(new Node(data));
        else
            insert(head.getNext(), data);
        return head;
    }
}

class Node {
    private int data;
    private Node next;

    Node(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }
}

