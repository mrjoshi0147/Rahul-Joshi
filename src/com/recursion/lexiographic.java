package com.recursion;

public class lexiographic {
    public static void main(String[] args) {
        print(0, 100);
    }

    public static void print(int ques, int ans) {
        if (ques > ans) {

            return;
        }
        for (int i = 0; i <= 9; i++) {
            if (ques == 0 && i == 0) {
                continue;
            }

            int item = ques * 10 + i;
            if (item <= ans) {
                System.out.println(item);
            }
            print(item, ans);
        }
    }
}
