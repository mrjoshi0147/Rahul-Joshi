package com.Home;

public class BinarySearchTree {
    private Node root;

    public void insert(int key) {
        this.root = insert(root, key);

    }

    private Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (node.value > key) {
            node.left = insert(node.left, key);
        } else {
            node.right = insert(node.right, key);
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
        Node right;
        Node left;

        public Node(int value) {
            this.value = value;
        }
    }

}
