package com.recursion;

public class countboardpath {
    static int count = 0;

    public static void main(String[] args) {
        print(0, 10, " ");
        System.out.println(count);
    }

    public static void print(int curr, int end, String ans) {
        if (curr == end) {
            count++;
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
