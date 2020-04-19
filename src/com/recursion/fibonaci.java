package com.recursion;

import org.w3c.dom.ls.LSOutput;

public class fibonaci {
    public static void main(String[] args) {

        int n = fibo(5);
        System.out.println(fibo(5));
    }

    public static int fibo(int n) {
        if (n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);

    }

}
