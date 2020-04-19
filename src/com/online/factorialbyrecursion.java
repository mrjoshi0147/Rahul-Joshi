package com.online;

public class factorialbyrecursion {
    public static void main(String[] args) {

        int f = factorial(4);
        System.out.println(f);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int n1 = factorial(n - 1);
        int n2 = n * n1;

        return n2;

    }
}
