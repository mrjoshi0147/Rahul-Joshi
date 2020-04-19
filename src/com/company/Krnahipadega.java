package com.company;

import java.util.*;

public class Krnahipadega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divident = sc.nextInt();
        int divisor = sc.nextInt();

        while (divident % divisor != 0) {
            int remainder = divident % divisor;
            divident = divisor;
            divisor = remainder;
        }
        System.out.print(divisor);

    }
}
