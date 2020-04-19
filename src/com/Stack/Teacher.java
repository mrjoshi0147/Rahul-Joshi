package com.Stack;

public interface Teacher {

    default void study() {
        System.out.println("I study like a teacher");
    }
}
