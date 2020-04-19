package com.bitmasking;

import java.util.*;

public class intro {
    public static void main(String[] args) {
//        checkinOddEven(0101);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swapping(a, b);
    }

    public static void checkinOddEven(int n) {

        if ((n & 1) == 1) {
            System.out.println("odd number");
        } else {
            System.out.println("even");
        }
    }

    public static void swapping(int a, int b) {
//swappping by bitwisae opertor or we can say by xor operator

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
