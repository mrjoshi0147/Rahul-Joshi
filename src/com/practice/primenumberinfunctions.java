package com.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class primenumberinfunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        boolean flag1 = true, flag2 = true;

        for (int i = 2; i < n1; i++) {
            if (n1 % i == 0) {
                flag1 = false;
                break;
            }
        }
        for (int i = 2; i < n2; i++) {
            if (n2 % i == 0) {
                flag2 = false;
                break;
            }
        }
        if (flag1)
            System.out.println(n1 + "is prime");

        else
            System.out.println(n1 + "is not prime");

        if (flag2)
            System.out.println(n2 + "is prime");

        else
            System.out.println(n2 + "is not prime");


    }

}
