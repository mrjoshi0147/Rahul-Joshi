package com.assignment3;

import java.util.*;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sourcenumber = sc.nextInt();
        int sourcebase = sc.nextInt();
        int destinationbase = sc.nextInt();
        int destinationnumber = sourcenumbertodestinationnumber(sourcenumber, sourcebase, destinationbase);
        System.out.println(destinationnumber);

    }

    public static int sourcenumbertodestinationnumber(int sourcenumber, int sourcebase, int destinationbase) {
        int multiplier = 1;
        int ans = 0;
        while (sourcenumber != 0) {
            int remainder = sourcenumber % destinationbase;
            ans = ans + multiplier * remainder;
            multiplier = multiplier * sourcebase;
            sourcenumber = sourcenumber / destinationbase;

        }
        return ans;

    }

}
