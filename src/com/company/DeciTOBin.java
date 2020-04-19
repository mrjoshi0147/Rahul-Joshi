package com.company;

import com.sun.source.util.DocTreePathScanner;

public class DeciTOBin {
    public static void main(String[] args) {
        System.out.println(decitobin(11));
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
