package com.jarruriquestion;

public class pathfinding {
    public static void main(String[] args) {

        rowcolumn("", 3, 3);
    }

    public static void rowcolumn(String processed, int row, int col) {

        if (row == 1 && col == 1) {
            System.out.println(processed);
        }
        if (row > 1) {
            rowcolumn(processed + "v", row - 1, col);
        }
        if (col > 1) {
            rowcolumn(processed + "h", row, col - 1);
        }
    }
}
