package com.online;

import java.util.ArrayList;
import java.util.*;

public class GenricTrees {
    private class Node {
        int data;
        ArrayList<Node> Children;

        Node(int data) {
            this.data = data;
            this.Children = new ArrayList<>();
        }
    }

    private Node root;
    private int size;

    GenricTrees() {
        Scanner s = new Scanner(System.in);
        this.root = takeInput(s, null, 0);
    }

    private Node takeInput(Scanner s, Node parent, int ithchild) {
        if (parent == null) {
            System.out.println("Enter the value of root node");
        } else {
            System.out.println("Enter the data for the " + ithchild + "ith child" + parent.data);

        }
        int NodeData = s.nextInt();
        Node node = new Node(NodeData);
        this.size++;

        System.out.println("Enter the number of children for " + node.data);
        int children = s.nextInt();

        for (int i = 0; i < children; i++) {
            Node child = this.takeInput(s, node, i);
            node.Children.add(child);

        }

        return node;
    }

    public void display() {
        this.display(this.root);

    }

    private void display(Node node) {
        String str = node.data + "=>";
        for (int i = 0; i < node.Children.size(); i++) {
            str = str + node.Children.get(i).data + " ,";

        }
        str = str + "End";
        System.out.println(str);
        for (int i = 0; i < node.Children.size(); i++) {
            this.display(node.Children.get(i));
        }
    }
}
