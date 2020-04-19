package com.recursion;

public class printingSubsequences {
    public static void main(String[] args) {
        print("abc", "");
    }

    public static void print(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < ques.length(); i++) {

            char ch = ques.charAt(i);
            String ros = ques.substring(0, i) + ques.substring(i + 1);
            print(ros, ans + ch);
        }
    }
}