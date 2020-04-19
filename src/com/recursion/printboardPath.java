package com.recursion;

public class printboardPath {
    public static void main(String[] args) {
        print(0, 10, " ");
    }

    public static void print(int curr, int end, String ans) {
        if (curr == end) {
            System.out.println(ans);
            return;
        }
        if (curr > end) {
            return;
        }
        for (int i = 1; i <= 6; i++) {
            print(curr + i, end, ans + i);
        }
    }
}