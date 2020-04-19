package com.recursion;

import java.util.ArrayList;

public class mazePath {
    public static void main(String[] args) {
        System.out.println(getmazepath(0, 0, 3, 3));
    }

    public static ArrayList<String> getmazepath(int cr, int cc, int ec, int er) {
        if (cc == er && cr == er) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        if (cc > ec || cr > er) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }
        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rrh = getmazepath(cr, cc + 1, ec, er);
        for (String rrhs : rrh) {
            mr.add("H" + rrhs);
        }
        ArrayList<String> rrv = getmazepath(cr + 1, cc, ec, er);
        for (String rrvs : rrv) {
            mr.add("V" + rrvs);
        }
        return mr;
    }
}
