package com.recursion;

public class Patterns {
    public static void main(String[] args) {
        paterns(10, 0);
    }

    public static void paterns(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row == col) {
            System.out.println();
            paterns(row - 1, 0);
            return;
        }
        System.out.print("*");
        paterns(row, col + 1);
    }
}
