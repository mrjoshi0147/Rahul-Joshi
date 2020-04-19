package com.company;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        int remainder = 0;
        while (n != 0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;

        }
        System.out.print("Reverse of the number is" + reverse);

    }
}
