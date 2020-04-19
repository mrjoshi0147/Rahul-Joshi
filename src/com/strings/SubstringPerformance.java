package com.strings;

public class SubstringPerformance {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Sbperformance(100000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void Sbperformance(int n) {

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i <= n; i++) {

            sb.append('i');
        }
    }
}
