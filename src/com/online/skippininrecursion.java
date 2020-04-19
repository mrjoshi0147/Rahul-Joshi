package com.online;

public class skippininrecursion {
    public static void main(String[] args) {
        skipping(5);
    }

    public static void skipping(int n) {
        if (n == 0) {
            return;
        }
        if (n % 2 == 1) {
            System.out.println(n);
        }
        skipping(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }

    }
}
