package com.online;

public class recursiondemo3 {
    public static void main(String[] args) {
        incresingdemo(5);
    }

    public static void incresingdemo(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        incresingdemo(n - 1);

        System.out.println(n);
    }
}
