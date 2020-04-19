package com.Lec22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GenricClient {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GenricTrees tree = new GenricTrees();

        tree.insert(s);
        tree.display();
        System.out.println(tree.count());
        System.out.println(tree.max());

        tree.atlevel();
    }
}
