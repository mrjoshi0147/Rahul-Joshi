package com.strings;

public class performance {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        Strperformance(100000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    public static void Strperformance(int n) {

        String str = " ";
        for (int i = 0; i <= n; i++) {

            str = str + i;
        }

    }
}
