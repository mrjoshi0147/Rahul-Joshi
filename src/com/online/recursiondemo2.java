package com.online;

public class recursiondemo2 {
    public static void main(String[] args) {
        pd(5);
    }

    public static void pd(int n) {
        if (n == 0) {
            return;
        }
        pd(n - 1);
        System.out.println(n);

    }
}
