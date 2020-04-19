package com.trees;

import java.util.Scanner;

public class GEnricClient {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        GenericTrees tree = new GenericTrees();

        tree.insert(s);

//
        tree.Atlevel(1);
        tree.levelorder();
    }

}
