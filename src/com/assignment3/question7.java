package com.assignment3;

import java.util.*;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = reversing(n);
        System.out.println("Reverse of the number is   " + digit);
    }

    public static int reversing(int n) {
        int reverse = 0;
        int remainder = 0;
        while (n != 0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        return reverse;
    }


}
