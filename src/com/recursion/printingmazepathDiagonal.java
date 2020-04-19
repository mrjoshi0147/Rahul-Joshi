package com.recursion;

public class printingmazepathDiagonal {
    public static void main(String[] args) {
        //  print(0,2,0,2,"");
        System.out.println(Print(0, 2, 0, 2));
    }

    public static void print(int cc, int ec, int cr, int er, String ans) {
        if (cc == ec && cr == er) {
            System.out.println(ans);
            return;
        }
        if (cc > ec || cr > er) {
            return;
        }
        print(cc + 1, ec, cr, er, ans + "H");
        print(cc, ec, cr + 1, er, ans + "V");
        print(cc + 1, ec, cr + 1, er, ans + "D");
    }

    public static int Print(int cc, int ec, int cr, int er) {
        if (cc == ec && cr == er) {
            return 1;
        }
        if (cc > ec || cr > er) {
            return 0;
        }
        int counth = Print(cc + 1, ec, cr, er);
        int countv = Print(cc, ec, cr + 1, er);
        int countd = Print(cc + 1, ec, cr + 1, er);

        return countv + counth + countd;
    }
}
