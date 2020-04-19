package com.practice;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class selectionSortt {
    public static void main(String[] args) {

        int array[] = {88, 65, 55, 44, 22};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int ar[]) {


        for (int i = 0; i < ar.length; i++) {

            int index = Util.maxindex(ar, 0, ar.length - i - 1);
            Util.swap(ar, index, ar.length - i - 1);
        }
    }
}

