package com.Stack;

public class DynamicStack extends Stack {

    @Override
    public void push(int element) {

        if (isfull()) {

            System.out.println("Bhai me bad gya");

            int[] ar = new int[2 * data.length];

            for (int i = 0; i < data.length; i++) {
                ar[i] = data[i];
            }
            data = ar;
        }

        super.push(element);
    }
}
