package com.string;

public class StringManipulation {
    public static void main(String[] args) {
//        char[] ch = {'a','b','c'};
////        String s = "abc";
//        String s = new String(ch);
//        System.out.println( s );

        String s1 = "hii";
        String s2 = "your";
        String s3 = "name";
        String s4 = "is";

        String finalString = String.join(" ", s1,s2,s3,s4);
        System.out.println(finalString);


    }
}
