package com.Lec24;

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

    public void inorder() {
        //prints in sorted order
        inorder(root, "");
    }

    private void inorder(Node node, String indent) {
        if (node == null) {
            return;
        }
        inorder(node.left, indent + "\t");
        System.out.println(node.value);
        inorder(node.left, indent + "\t");
    }

    public void inrange(int k1, int k2) {
        inrange(root, k1, k2);
    }

    public void inrange(Node node, int k1, int k2) {

        if (node == null) {
            return;
        }
        if (node.value > k1 && node.value < k2) {
            System.out.println(node.value);
        }

        if (node.value > k1) {
            inrange(node.left, k1, k2);

        }
        if (node.value < k2) {
            inrange(node.right, k1, k2);
        }

    }

    public int height() {
        return height(root);
    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public int successor(int k) {
        Node success = null;
        Node current = root;

        while (current != null) {
            if (current.value > k) {

                if (success == null || success.value > current.value) {
                    success = current;
                }
                current = current.left;
            } else {
                current = current.right;
            }
        }


        return success.value;
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
