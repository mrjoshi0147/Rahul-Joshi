package com;

import java.util.*;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int reverse=sc.nextInt();
//        int remainder=sc.nextInt();
        int remainder;
        int reverse = 0;


        while (n != 0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }

        System.out.print(reverse);


    }
}
