package com.company;

import java.util.*;
import java.util.Arrays;

public class Util {

    public static void main(int ar[], int i, int j) {
        int t = ar[j];
        ar[j] = ar[j + 1];
        ar[j + 1] = t;

    }
}
