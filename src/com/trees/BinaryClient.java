package com.trees;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryClient {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input1");
        Scanner s = new Scanner(file);
        BInaryTrees tree = new BInaryTrees();
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
//      tree.display();
//      tree.postorder();
//    tree.inorder();
//        System.out.println( tree.height());
//        System.out.println(tree.find(6));
        tree.levelorder();
    }
}
