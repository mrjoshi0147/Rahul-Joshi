package com.oopss;

import java.sql.SQLOutput;

public class personclient {
    public static void main(String[] args) {
        person p1 = new person();
        person p2 = new person();
        person p3 = new person(25);
        person p4 = new person(20, "D");

//        System.out.println(p1.age);
//        System.out.println(p1.name);
        System.out.println(p1.getAge());
        System.out.println(p1.getName());

//        p2.name="A";
//        p2.age=10;
        p2.setAge(20);
        p2.setName("A");

        System.out.println(p2.getAge());
        System.out.println(p2.getName());
        System.out.println(p3.getAge());
        System.out.println(p4.getName());
        System.out.println(p4.getAge());
    }
}
