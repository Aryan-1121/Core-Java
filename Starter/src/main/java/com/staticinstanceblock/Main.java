package com.staticinstanceblock;

public class Main {
    public static void main(String[] args) {
        Child1 c = new Child1();
        //static first              // since this class is being extended in child therefore this class will be loaded first
        //static child 1
        // first instacne from 1st class
        // 2nd instance from 1st class
        // const from first class
        // first instance from child 1
        // sencond instance from child 1
        //constructor from child 1
    }
}
