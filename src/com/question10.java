package com;

import java.util.*;

public class question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
//        int a=0;
//        int b=1;
//        int row=1;
//        System.out.print(a);
//        System.out.println();
//        while(row<=n){
//            int col=1;
//             int k=a+b;
//            while (col<=row){
//                System.out.print(k);
//            col=col+1;
//            }
//            System.out.println();
//             row=row+1;
//            a=b;
//            b=k;
        int a = 0;
        int b = 1;
        int n = 0;
        int row = 1;
        System.out.println(a);
        System.out.print(b);
        while (n <= k) {
            int col = 1;
            n = a + b;
            while (col <= row) {
                System.out.print(n + "");
                col = col + 1;

            }
            System.out.println();

            a = b;
            b = n;
            row = row + 1;
        }

    }
}
