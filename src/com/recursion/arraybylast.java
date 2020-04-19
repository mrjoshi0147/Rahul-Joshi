package com.recursion;

import java.util.Arrays;
import java.util.ArrayList;

public class arraybylast {
    public static void main(String[] args) {
        int ar[] = {3, 8, 1, 8, 8, 7};

        int n = lastIndex(ar, 0, 7);
        System.out.println(n);
    }

    public static int lastIndex(int ar[], int si, int data) {
        if (si == ar.length) {
            return -1;
        }
        int index = lastIndex(ar, si + 1, data);
        if (index == -1) {
            if (ar[si] == data) {
                return si;
            } else {
                return -1;
            }
        } else {
            return index;
        }

    }
}
