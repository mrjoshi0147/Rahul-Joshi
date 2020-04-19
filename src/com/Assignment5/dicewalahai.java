package com.Assignment5;

public class dicewalahai {
    public static void main(String[] args) {
        findingnumber("", 4);
    }

    public static void findingnumber(String processed, int target) {

        if (target == 0) {
            System.out.println(processed);
            return;
        }
        for (int i = 1; i <= target && i <= 6; i++) {
            findingnumber(processed + i, target - i);

        }
    }
}
