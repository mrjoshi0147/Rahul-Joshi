package com.recursion;

public class recursionprint {
    public static void main(String[] args) {
        printing("abc", " ");
    }

    public static void printing(String str, String res) {
        if (str.length() == 0) {
            System.out.println(res);
            return;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        printing(ros, res);
        printing(ros, res + cc);
    }
}
