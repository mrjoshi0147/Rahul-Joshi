package com.jarruriquestion;

public class pathpart2 {
    public static void main(String[] args) {
        System.out.println(mazehain(3, 3, ""));
    }

    public static int mazehain(int row, int col, String processed) {


        if (row == 1 && col == 1) {
            System.out.println(processed);
            return 1;
        }
        int count = 0;
        if (row > 1) {
            count += mazehain(row - 1, col, processed + "v");
        }
        if (col > 1) {
            count += mazehain(row, col - 1, processed + "h");
        }
        return count;
    }

}
