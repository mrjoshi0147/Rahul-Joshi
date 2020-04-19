package com.company;

import java.util.*;

public class IfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        if (n % i == 0) {
            System.out.print(" even digits");
        } else {
            System.out.print("Odd digits");
        }

    }
}
