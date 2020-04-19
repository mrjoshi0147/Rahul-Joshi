package com.practice;

import java.util.StringJoiner;
import java.util.*;

public class IntroToString {
    public static void main(String[] args) {

        String s = "hello";
//        String p = "hello";
//        System.out.println(s.equals(p));
//
//        System.out.println(s.indexOf("l"));
//        System.out.println(s.indexOf("l" , 2));
        locations(s, 'l');
        substring(s);
        pallendromofAString(s);
    }

    public static void locations(String str, int ch) {
        String s = "hello";
        int index = 0;
        while (true) {

            index = str.indexOf(ch, index);

            if (index == -1) {
                break;
            }
            System.out.println(index);
            index = index + 1;
        }
    }

    public static void substring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static boolean pallendromofAString(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) ;
            return false;
        }
        start++;
        end--;

        return true;
    }

}

