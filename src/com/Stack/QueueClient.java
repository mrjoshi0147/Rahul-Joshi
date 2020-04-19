package com.Stack;

import com.oops.CircularQueue;

public class QueueClient {

    public static void main(String[] args) {

        DynamicQueue queue = new DynamicQueue();

        for (int i = 0; i <= 50; i++) {
            queue.insert(i);
        }
//
//        for (int i = 0; i <=50 ; i++) {
//            System.out.println(queue.remove());
//
//        }

        queue.display();
    }
}

