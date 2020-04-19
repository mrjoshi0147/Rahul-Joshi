package com.jarruriquestion;

import java.util.Arrays;
import java.util.ArrayList;

public class question {
    public static void main(String[] args) {

        System.out.println(rowcolumn("", 3, 3));
    }

    public static ArrayList rowcolumn(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList List = new ArrayList();
            List.add(processed);
            return List;
        }
        ArrayList list = new ArrayList();

        if (row > 1) {
            list.addAll(rowcolumn(processed + "v", row - 1, col));
        }
        if (col > 1) {
            list.addAll(rowcolumn(processed + "h", row, col - 1));
        }
        return list;
    }
}

