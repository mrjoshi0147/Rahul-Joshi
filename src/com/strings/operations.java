package com.strings;

import java.util.*;

public class operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        chars(str);


    }

    public static void chars(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }
}
