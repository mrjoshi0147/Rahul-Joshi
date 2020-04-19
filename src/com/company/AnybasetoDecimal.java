package com.company;

import java.util.*;

public class AnybasetoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sourcenumber = sc.nextInt();
        int sourcebase = sc.nextInt();
        int destinationbase = sc.nextInt();
        int result = anybasetodeci(sourcenumber, sourcebase, destinationbase);
        System.out.println(result);
    }

    public static int anybasetodeci(int sourcenumber, int sourcebase, int destinationbase) {
        int multiplier = 1;
        int ans = 0;
        while (sourcenumber != 0) {
            int remainder = sourcenumber % destinationbase;
            ans = ans + remainder * multiplier;
            multiplier = multiplier * sourcebase;
            sourcenumber = sourcenumber / destinationbase;

        }
        return ans;

    }

}



