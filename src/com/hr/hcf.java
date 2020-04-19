package com.hr;

import java.util.*;

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hcf = 0;
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    hcf = i;
                }
            }
            System.out.println(hcf);


        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    hcf = i;
                }
            }
            System.out.println(hcf);
        }
    }
}
