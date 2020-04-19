package com.Stack;

public interface Student {

    default void study() {
        System.out.println("I study like a teacher");
    }
}
