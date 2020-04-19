package com.recursion;

import java.util.ArrayList;

public class mazePathDiagonal {
    public static void main(String[] args) {
        System.out.println(getmazepathDiagonal(0, 0, 2, 2));
    }

    public static ArrayList<String> getmazepathDiagonal(int cr, int cc, int ec, int er) {
        if (cr == er && cc == ec) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        if (cr > er || cc > ec) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }
        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rrv = getmazepathDiagonal(cr + 1, cc, ec, er);
        for (String rrvs : rrv) {
            mr.add("V" + rrvs);
        }
        ArrayList<String> rrh = getmazepathDiagonal(cr, cc + 1, ec, er);
        for (String rrhs : rrh) {
            mr.add("H" + rrhs);
        }
        ArrayList<String> rrd = getmazepathDiagonal(cr + 1, cc + 1, ec, er);
        for (String rrds : rrd) {
            mr.add("D" + rrds);
        }
        return mr;
    }
}