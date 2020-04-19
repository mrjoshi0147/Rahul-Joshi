package com.Assignment5;

import java.util.*;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if (str.equals(rev)) {
            System.out.println("yes it is pellendrom");
        } else {

            System.out.println("not pallendrom");
        }

    }


}
