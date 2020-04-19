package com.online;

public class powerinrecursion {
    public static void main(String[] args) {
        System.out.println(power(2, 5));

    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int p = power(x, n - 1);
        int pw = x * p;
        return pw;

    }
}
