package com.company;

public class Functionss {
    public static int val = 20;

    public static void main(String[] args) {
//        division();
//        divisionParams(20,30);
//        divisionParams(25 , 50);
        int one = 20;
        int two = 50;
//
//        int res=additionReturn(one,two);
//        System.out.println(res);
//        System.out.println(val);
//        int val=2000;
//        System.out.println(val);
//        System.out.println(Functionss.val);
//        int ans=Demoscope(10);
//        System.out.println(ans);

        System.out.println(one + "," + two);
        swap(one, two);
        System.out.println(one + "," + two);
    }

    public static void swap(int one, int two) {
        int temp = one;
        one = two;
        two = one;
        System.out.println(one + "," + two);


    }

    public static int Demoscope(int one) {
        int plus = one + val;
        return plus;
    }

    public static int additionReturn(int a, int b) {
        int sum = a + b;
//        System.out.println(sum);
        return sum;


    }

    public static void divisionParams(int a, int b) {
        int division = a % b;
        System.out.println(division);

    }

    public static void division() {

        int a = 156;
        int b = 12;
        int c = a / b;
        System.out.println(c);
    }

}
