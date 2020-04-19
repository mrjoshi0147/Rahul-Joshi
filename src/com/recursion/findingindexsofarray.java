package com.recursion;

public class findingindexsofarray {
    public static void main(String[] args) {
        int ar[] = {6, 8, 1, 1, 8, 3, 4};
        System.out.println(firstindex(ar, 0, 4));
    }

    public static int firstindex(int ar[], int si, int data) {
        if (ar[si] == ar.length) {
            return -1;
        }
        if (ar[si] == data) {
            return si;
        } else {
            int restAns = firstindex(ar, si + 1, data);

            return restAns;
        }
    }
}
