package com.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
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
