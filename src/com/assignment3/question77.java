package com.assignment3;

import java.util.*;

public class question77 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = reversing(n);
        System.out.println(reverse);

    }

    public static int reversing(int n) {
        int place = 1;
        int num = 0;

        while (n > 0) {

            int digit = n % 10;
            num = (int) (num + place * Math.pow(10, digit - 1));
            place = place + 1;


        }
        return num;

    }
}
