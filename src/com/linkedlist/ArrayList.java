package com.linkedlist;

import java.util.Arrays;

public class ArrayList {

    private int ar[];
    int DEFAULT_SIZE = 10;
    int size = 0;

    public ArrayList() {
        this.ar = new int[DEFAULT_SIZE];
        this.size = 0;
    }

//    public boolean isfull(){
//        if(isfull()){
//            resize();
//        }
//        ar[size++]=element;
//    }

    private void resize() {
    }

    public void add(int element) {
        ar[size++] = element;
    }

    public void set(int index, int elemnt) {
        ar[index] = elemnt;
    }

    public int remove() {
        int temp = ar[size - 1];
        size--;
        return temp;
    }

    public int get(int index) {
        return ar[index];
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(ar[i]);
        }
    }
}
