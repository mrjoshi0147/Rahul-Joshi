package com.linkedlist;

public class Client {
    public static void main(String[] args) {
        Engine engine1 = new PetrolEngine();
        engine1.stop();
//        PetrolEngine engine = new PetrolEngine() {
//            @Override
//            public void gear() {
//                System.out.println("hi bi");
//            }
//        };
//        engine.stop();
//        engine.nitro();
//        engine.start();

//            add(1,23,4,5,6,7,8,9,7,6);

    }

    public static void add(int... ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum = sum + ar[i];
        }
        System.out.println(sum);
    }

}



