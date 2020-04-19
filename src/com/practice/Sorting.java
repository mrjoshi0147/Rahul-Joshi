package com.practice;

import com.company.Util;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

import static com.company.Util.*;

public class Sorting {
    public static void main(String[] args) {
        int array[] = {88, 65, 55, 44, 22};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int ar[]) {


        for (int i = 0; i < ar.length; i++) {

            for (int j = 0; j < ar.length - i - 1; j++) {

                if (ar[j] > ar[j + 1]) {
                    int counetre = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = counetre;

                }


            }
        }

    }
}
