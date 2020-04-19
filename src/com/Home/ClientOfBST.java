package com.Home;

public class ClientOfBST {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(4);
        tree.insert(2);
        tree.insert(7);
        tree.insert(3);
        tree.display();
    }
}
