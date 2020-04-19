package com.strings;

public class substring {
    public static void main(String[] args) {

        String str = "hello";
//as in this code i have written ending index 4 but as i say that the value of index will reduce by one in ending index
        System.out.println(str.substring(0, 4));

// suppose if i am writing beingning index and ending index same then nothing will be print in the console

        System.out.println(str.substring(3, 3));

// string also have a finction that if we write substring(3)  then it will automaticallt take 3 as its starting index and it will
// start pinting from it for example
        System.out.println(str.substring(3));

    }
}
