package com.bitmasking;

import java.util.*;

public class howtocalculatesetbits {
    public static void main(String[] args) {

        System.out.println(setCount(5));

    }

    public static int setCount(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;

    }

}
