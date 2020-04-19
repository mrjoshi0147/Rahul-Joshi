package com.company;

import java.util.*;

public class Functions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int stop = sc.nextInt();
        int step = sc.nextInt();
        convertor(start, stop, step);
    }

    public static void convertor(int start, int stop, int step) {
        while (start <= stop) {
            float c = (5 / 9) * (start - 32);
            System.out.print("c");
            start = start + step;
        }


    }
}
