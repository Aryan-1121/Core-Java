package com.immutable;

public class Main {
    public static void main(String[] args) {
       Mutable mutable = new Mutable(4, "hero");
        System.out.println(mutable);


        mutable = new Mutable(5, "villain");
        System.out.println("updated obj = "+mutable);
    }
}
