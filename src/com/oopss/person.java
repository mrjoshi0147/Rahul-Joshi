package com.oopss;

public class person {
    private String name;
    private int age;

    public person() {
        System.out.println("deafault");
    }

    public person(int age) {
        System.out.println("hello hello");
        this.age = age;

    }

    public person(int age, String name) {
        System.out.println("connstructor with two parameters");
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
