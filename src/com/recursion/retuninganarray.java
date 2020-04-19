//package com.recursion;
//import java.util.*;
//public class retuninganarray {
//    public static void main(String[] args) {
//int ar=[3,8,1,8,8,4];
//        int[] ans=allindices(ar,0,8,0);
//
//
//    }
//    public static int[] allindices(int[] ar, int si, int data, int count){
//if(si==ar.length){
//    int[] base =new int [count];
//    return base;
//}
//int[] indices = null;
//if (ar[si]==data){
//    indices=allindices(ar,si+1,data,count+1);
//}
//else{
//    indices=allindices(ar,si+1,data,count);
//}
//if (ar[si]==data){
//    indices[count]=si;
//}
//return indices;
//
//    }
//}
