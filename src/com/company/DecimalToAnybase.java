package com.company;

import java.util.*;

public class DecimalToAnybase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int destinationnumber = sc.nextInt();
        int destinationbase = sc.nextInt();
        int sourcebase = sc.nextInt();
        int result = decimaltoanybase(destinationnumber, destinationbase, sourcebase);
        System.out.println(result);

    }

    public static int decimaltoanybase(int destinationnumber, int destinationbase, int sourcebase) {
        int multiplier = 1;
        int ans = 0;
        while (destinationnumber != 0) {
            int remainder = destinationnumber % sourcebase;
            ans = ans + multiplier * remainder;
            multiplier = multiplier * destinationbase;
            destinationnumber = destinationnumber / sourcebase;

        }
        return ans;


    }
}
