package com.company;

import javax.swing.*;
import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
        int n = 3;
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                if (col <= row) ;
                System.out.print("*");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
        int col = 0;
        if (col <= row)
            System.out.print("*");

        col = col + 1;
        System.out.println();

        row = row - 1;

    }


}



