package com.Stack;

public class CircularQueue {
    protected int data[];
    protected int end;
    protected int front;
    protected int size = 0;
    private int DEFAULT_SIZE = 10;

    public CircularQueue() {
        this.data = new int[DEFAULT_SIZE];
        this.end = 0;
        this.front = 0;
        this.size = 0;
    }

    public void insert(int value) {
        if (isFull()) {
            return;
        }

        data[end++] = value;
        end = end % data.length;

        size++;
    }

    protected boolean isFull() {
        return size == data.length;
    }

    public int remove() {

        if (isEmpty()) {
            System.out.println("empty");
            return -1;
        }

        int temp = data[front];
//
//        for (int i = 1; i <end ; i++) {
//            data[i-1]=data[i];
//        }
        front++;
        front = front % data.length;
        size--;
        return temp;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public int front() {
        return data[front];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[(front + i) % data.length] + " ");
        }
        System.out.println();
    }
}