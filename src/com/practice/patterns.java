package com.practice;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;

public class patterns {
    public static void main(String[] args) {

        int n = 5;
        int row = 5;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                if (col <= row)
                    System.out.print("*");
                col = col + 1;
            }
            System.out.println();
            row = row - 1;
        }
    }


}
