package com.practice;

import java.util.*;

public class example {
    public static void main(String[] args) {
        System.out.println("this is main");

        func1();
        func2();
    }

    public static void func1() {
        System.out.println("this is func1");
    }

    public static void func2() {
        System.out.println("this is func2");
        func1();
    }

}
