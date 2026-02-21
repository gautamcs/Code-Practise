package com.gautam.string;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuffer temp = new StringBuffer();
        char[] ch  = str.toCharArray();
        for(int i = ch.length-1; i >=0; i--) {
            temp = temp.append(ch[i]);
        }

        System.out.println(" Reverse String: "+temp);
    }
}
 