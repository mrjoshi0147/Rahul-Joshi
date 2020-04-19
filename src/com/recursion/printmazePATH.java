package com.recursion;

public class printmazePATH {
    static int count = 0;

    public static void main(String[] args) {
//        print(0,2,0,2,"");
//        System.out.println(count);
        System.out.println(countmazepath(0, 2, 0, 2));
    }

    public static void print(int cc, int ec, int cr, int er, String ans) {
        if (cc == ec && cr == er) {
            count++;
            System.out.println(ans);
            return;
        }
        if (cc > ec || cr > er) {
            return;
        }
        print(cc + 1, ec, cr, er, ans + "H");
        print(cc, ec, cr + 1, er, ans + "V");
    }

    public static int countmazepath(int cc, int ec, int cr, int er) {
        if (cc == ec && cr == er) {
            return 1;
        }
        if (cc > ec || cr > er) {
            return 0;
        }
        int counh = countmazepath(cc + 1, ec, cr, er);
        int counv = countmazepath(cc, ec, cr + 1, er);

        return counh + counv;
    }
}
