package com.company;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int a = 1;
        int b = 1;
        int n = 0;

        System.out.print(a);
        System.out.print(b);
        while (n <= k) {
            n = a + b;

            System.out.print(n + "");
            a = b;
            b = n;

        }

    }
}
