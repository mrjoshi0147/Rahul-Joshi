package com.assignment3;

import java.util.*;

public class quesion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deci = sc.nextInt();
        int binarynumber = decitobin(deci);
        System.out.println(binarynumber);
    }

    public static int decitobin(int deci) {
        int bin = 0;
        int place = 1;
        while (deci > 0) {
            int digit = deci % 2;
            deci = deci / 2;
            bin = bin + digit * place;
            place = place * 10;
        }
        return bin;

    }

}
