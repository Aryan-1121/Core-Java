package com.staticinstanceblock;

public class Main {

    int a = 4;
    static int b = 3;

    static{
        System.out.println("static of main class ");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        Child1 c = new Child1();
        //static first              // since this class is being extended in child therefore in constructor call of Child1() first call will be to super() i.e. First's class constructor
        //static child 1
        // first instacne from 1st class
        // 2nd instance from 1st class
        // const from first class
        // first instance from child 1
        // sencond instance from child 1
        //constructor from child 1

//        System.out.println(this.a);         // "this" is obj specific hence can-not be used in static method

//        System.out.println(a);                    // static method can not access non-static members
        System.out.println(b);
    }
}
