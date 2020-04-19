package com.company;

public class Convertor {
    public static void main(String[] args) {
        System.out.println(bintodeci(1011));
    }

    public static int bintodeci(int bin) {
        int digit = 10101;
        int deci = 0;
        int place = 0;
        while (bin > 0) {
            digit = bin % 10;
            bin = bin / 10;
            deci = (int) (deci + digit * Math.pow(2, place));
            place = place + 1;


        }
        return deci;
    }
}
