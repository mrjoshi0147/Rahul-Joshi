package com.Assignment5;

public class strings {
    public static void main(String[] args) {
        String str = "abc";

        subseqeunce("", "abc");
    }

    public static void subseqeunce(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        subseqeunce(processed + ch, unprocessed);
        subseqeunce(processed, unprocessed);


    }
}
