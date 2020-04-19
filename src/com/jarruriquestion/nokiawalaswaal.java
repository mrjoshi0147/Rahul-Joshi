package com.jarruriquestion;

public class nokiawalaswaal {
    public static void main(String[] args) {
        keaypadcode("", "246");

    }

    public static void keaypadcode(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        int digit = unprocessed.charAt(0) - '0';
        unprocessed = unprocessed.substring(1);
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);
            keaypadcode(processed + ch, unprocessed);
        }

    }
}
