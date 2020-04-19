package com.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BInaryTrees {

    private Node root;

    public void insert(Scanner s) {
        this.root = insert(root, s);
    }

    private Node insert(Node node, Scanner s) {
        if (node == null) {
            System.out.println("Enter the value");
            int val = Integer.parseInt(s.nextLine());
            return new Node(val);

        }
        System.out.println("Enter the direction");
        String dir = s.nextLine();
        if (dir.equals("left")) {
            node.left = insert(node.left, s);
        } else {
            node.right = insert(node.right, s);
        }
        return node;
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
//         for post order sout will come here from the top
//             System.out.println(indent+node.value);
    }

    public void postorder() {
        postorder(root, "");
    }

    private void postorder(Node node, String indent) {
        if (node == null) {
            return;
        }
        postorder(node.left, indent + "\t");
        postorder(node.right, indent + "\t");
        System.out.println(indent + node.value);
    }

    public void inorder() {
        inorder(root, "");
    }

    private void inorder(Node node, String indent) {
        if (node == null) {
            return;
        }
        inorder(node.left, indent + "\t");
        System.out.println(indent + node.value);
        inorder(node.right, indent + "\t");
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public boolean find(int target) {
        return find(root, target);
    }

    private boolean find(Node node, int target) {
        if (node == null) {
            return false;
        }
        if (node.value == target) {
            return true;
        }
        return find(node.left, target) || find(node.right, target);
    }

    public void levelorder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            System.out.println(temp.value);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
