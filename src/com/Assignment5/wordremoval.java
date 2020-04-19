package com.Assignment5;

public class wordremoval {
    public static void main(String[] args) {
        String str = "hihi";
        hiwala("", "hihi");
    }

    public static void hiwala(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        if (ch == 'i') {
            hiwala(processed, unprocessed);
        } else {
            hiwala(processed + ch, unprocessed);
        }


    }
}
