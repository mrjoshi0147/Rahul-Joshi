package com.strings;

public class substringdemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        System.out.println(sb.length());

        sb.append("abc");
        System.out.println(sb);

        sb.insert(2, "def");
        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);

    }
}
