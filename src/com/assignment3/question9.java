package com.assignment3;

import java.util.*;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int armstrongnumber = checkingarmstrongnumber(n, n2);
        System.out.println(armstrongnumber);
    }

    public static int checkingarmstrongnumber(int n, int n2) {
        int b = 3;
        int armsnumber = 0;
        while (n != 0) {
            int remainder = n % 10;
            armsnumber = (int) Math.pow(remainder, b);
            armsnumber = armsnumber + (remainder * remainder * remainder);
        }
        return armsnumber;
    }

}
