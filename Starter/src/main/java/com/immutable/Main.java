package com.immutable;

public class Main {
    public static void main(String[] args) {
       Mutable mutable = new Mutable(4, "hero");
        System.out.println(mutable);
        System.out.println(mutable.hashCode());

        mutable = new Mutable(5, "villain");        // this  is allowed (its not modifying , we are creating whole new obj, with same reference var) it will create a totally new boj of mutable with this new values and point to it and leave the previous obj (that will be now collected by GC)
        System.out.println("updated obj = "+mutable);
        System.out.println(mutable.hashCode());

    }
}
