package org.solutions;

import java.util.Scanner;

public class Day22_BinarySearchTrees {

    /**
     * Problem Statement -
     * [Binary Search Trees](https://www.hackerrank.com/challenges/30-binary-search-trees)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        int value;
        Node root = new Node(Integer.parseInt(scanner.nextLine().trim()));
        while (n>1) {
            value = Integer.parseInt(scanner.nextLine().trim());
            Node.insert(root, value);
            n--;
        }
        scanner.close();
        int height=Node.getHeight(root);
        System.out.println(height);
    }

    static class Node {
        int value;
        Node left,right;

        Node(int value){
            this.value = value;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public static Node insert(Node root, int data) {
            if(root==null){
                return new Node(data);
            }
            else {
                Node node;
                if (data <= root.getValue()) {
                    node = insert(root.getLeft(), data);
                    root.setLeft(node);
                } else {
                    node = insert(root.getRight(), data);
                    root.setRight(node);
                }
            }
            return root;
        }
        public static int getHeight(Node root) {
            return root == null ? -1 : 1 + Math.max(getHeight(root.getLeft()), getHeight(root.getRight()));
        }
    }
}