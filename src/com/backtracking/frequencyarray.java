package com.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class frequencyarray {
    public static void main(String[] args) {

        String str = "abc";

        int freq[] = frequency(str);
//        System.out.println(Arrays.toString(freq));
        permute("", freq, str.length());
    }

    public static void permute(String processed, int freq[], int length) {
        if (length == 0) {
            System.out.println(processed);
            return;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                freq[i]--;
                permute(processed + (char) (i + 'a'), freq, length - 1);

                freq[i]++;
            }

        }

    }

    public static int[] frequency(String str) {
        int ar[] = new int[26];
        for (int i = 00; i < str.length(); i++) {
            char ch = str.charAt(i);

            ar[ch - 'a']++;
        }
        return ar;
    }
}
