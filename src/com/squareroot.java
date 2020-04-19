package com;

import java.util.*;

public class squareroot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 10;
        int squareroort = root(n);
        System.out.println(squareroort);

    }

    public static int root(int n) {

        n = 10;
        int start = 1;
        int end = n;
        int ans = 0;
        int m = (int) 0.1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid > n) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
                while (ans * ans < n) {
                    ans = ans + m;
                }
                ans = ans - m;
                m = m / 10;

            }


        }
        return ans;
    }
}
