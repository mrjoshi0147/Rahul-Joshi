package com.Arraysss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class waveprint {
    public static void main(String[] args) {
        int ar[][] = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}};
        Waveprint(ar);
    }

    public static void Waveprint(int ar[][]) {
        for (int i = 0; i < ar.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < ar[i].length; j++) {
                    System.out.print(ar[i][j] + " ");
                }
            } else {
                for (int j = ar[i].length - 1; j >= 0; j--) {
                    System.out.print(ar[i][j] + " ");
                }
            }

        }

    }
}
