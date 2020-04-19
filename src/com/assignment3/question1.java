package com.assignment3;

import java.util.*;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int decimalnumber = binarytodecimal(bin);
        System.out.println(decimalnumber);

    }

    public static int binarytodecimal(int bin) {
        int deci = 0;
        int place = 1;
        while (bin > 0) {
            int digit = bin % 10;
            bin = bin / 10;
            deci = deci + digit * place;
            place = place * 2;

        }
        return deci;

    }
}
