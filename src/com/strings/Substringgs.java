package com.strings;

import java.util.*;


public class Substringgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Substrings(str);
    }

    public static void Substrings(String str) {
        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
            System.out.println(" ");


        }


    }
}
