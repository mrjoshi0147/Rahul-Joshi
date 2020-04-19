package com.company;

import com.sun.source.util.DocTreePathScanner;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int stop = s.nextInt();
        int step = s.nextInt();
        convertor(start,
                stop,
                step);


    }

    private static void convertor(int start, int stop, int step) {


        while (start <= stop) {
            float c = (5f / 9) * (start - 32);
            System.out.println(c);
            start = start + step;
        }
    }
}
