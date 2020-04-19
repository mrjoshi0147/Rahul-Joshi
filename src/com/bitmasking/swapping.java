package com.bitmasking;

import java.util.*;

public class swapping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printss("abc", "");
    }

    public static void printss(String str, String result) {
        int count = 0;
        if (str.length() == 0) {
            System.out.println(result + " " + count);
            return;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        printss(ros, result);
        count++;
        printss(ros, result + cc);
        count++;
    }
}
