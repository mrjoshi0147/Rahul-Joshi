package com.recursion;

import java.util.*;

public class recursion {
    public static void main(String[] args) {

        pd(5);
        fact(5);
    }

    public static void pd(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        pd(n - 1);
        System.out.println(n);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        System.out.println(n);
        return n * fact(n - 1);

    }
}

