package com.gautam.string;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello";
        String temp = "";
        char[] ch  = str.toCharArray();
        for(int i = ch.length-1; i >=0; i--) {
            temp = temp+ch[i];
        }

        System.out.println(" Reverse String: "+temp);
    }
}
