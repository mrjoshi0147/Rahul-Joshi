package com.practice;

import java.util.*;

public class primenumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if (isprime(n1))
            System.out.println(n1 + "  is prime");
        else
            System.out.println(n1 + " is not prime");

        if (isprime(n2))
            System.out.println(n2 + "  is prime");

        else
            System.out.println(n2 + "   is not prime");
    }

    public static boolean isprime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
