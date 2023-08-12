package org.solutions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23_BinaryTrees {

    /**
     * Problem Statement -
     * [Binary Trees](https://www.hackerrank.com/challenges/30-binary-trees)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        int value;
        NodeClass root = new NodeClass(Integer.parseInt(scanner.nextLine().trim()));
        while (n > 1) {
            value = Integer.parseInt(scanner.nextLine().trim());
            NodeClass.insert(root, value);
            n--;
        }
        scanner.close();
        Queue<NodeClass> roots = new LinkedList<>();
        roots.add(root);
        n = NodeClass.getHeight(root);
        NodeClass node;
        while (n >= 0) {
            int limit = roots.size();
            for (int i = 0; i < limit; i++) {
                node = roots.poll();
                System.out.print(node.getValue() + " ");
                if (node.getLeft() != null)
                    roots.add(node.getLeft());
                if (node.getRight() != null)
                    roots.add(node.getRight());
            }
            n--;
        }
    }

    static class NodeClass {
        private int value;
        private NodeClass left, right;

        NodeClass(int value) {
            this.value = value;
        }

        public void setLeft(NodeClass left) {
            this.left = left;
        }

        public void setRight(NodeClass right) {
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public NodeClass getLeft() {
            return left;
        }

        public NodeClass getRight() {
            return right;
        }

        public static NodeClass insert(NodeClass root, int data) {
            if (root == null) {
                return new NodeClass(data);
            } else {
                NodeClass node;
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

        public static int getHeight(NodeClass root) {
            return root == null ? -1 : 1 + Math.max(getHeight(root.getLeft()), getHeight(root.getRight()));
        }
    }
}