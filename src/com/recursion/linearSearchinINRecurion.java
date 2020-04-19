package com.recursion;

public class linearSearchinINRecurion {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5};
        System.out.println(linearsearch(ar, 3, 0));

    }

    public static int linearsearch(int ar[], int element, int index) {
        if (ar.length == index) {
            return -1;
        }
        if (ar[index] == element) {
            return index;
        }
        return linearsearch(ar, element, index + 1);
    }
}
