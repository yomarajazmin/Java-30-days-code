package org.solutions;

import java.util.Scanner;

public class Day24_LinkedListDeletion {


    /**
     * Problem Statement -
     * [Linked List Deletion](https://www.hackerrank.com/challenges/30-linked-list-deletion)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int element = scanner.nextInt();
        NodeClass head = NodeClass.insert(null, element);
        NodeClass initialPointer = head;
        while (n > 1) {
            element = scanner.nextInt();
            head = NodeClass.insert(head, element);
            n--;
        }
        scanner.close();

        head = NodeClass.removeDuplicates(initialPointer);
        while (head != null) {
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
    }

    static class NodeClass {
        private int data;
        private NodeClass next;

        NodeClass(int data) {
            this.data = data;
        }

        public NodeClass getNext() {
            return next;
        }

        public void setNext(NodeClass next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public static NodeClass insert(NodeClass head, int data) {
            if (head == null)
                return new NodeClass(data);

            if (head.getNext() == null)
                head.setNext(new NodeClass(data));
            else
                insert(head.getNext(), data);
            return head;
        }

        public static NodeClass removeDuplicates(NodeClass head) {
            NodeClass currentNode = head;
            while (currentNode != null && currentNode.getNext() != null) {
                while (currentNode.getNext() != null && currentNode.getData() == currentNode.getNext().getData())
                    currentNode.setNext(currentNode.getNext().getNext());
                currentNode = currentNode.getNext();
            }
            return head;
        }
    }
}



