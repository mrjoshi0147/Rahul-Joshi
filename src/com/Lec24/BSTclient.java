package com.Lec24;

public class BSTclient {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(4);
        tree.insert(3);
        tree.insert(6);


//        tree.display();
//        System.out.println(tree.successor(3));
//        tree.inrange(3,6);
//        tree.inorder();
        System.out.println(tree.height());
    }
}
