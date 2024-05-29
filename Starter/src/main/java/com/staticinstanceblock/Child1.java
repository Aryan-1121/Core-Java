package com.staticinstanceblock;

public class Child1 extends First{


    static {
        System.out.println("static form child 1 ");
    }

    {
        System.out.println("first instance from child 1  ");
    }

Child1(){
    System.out.println("const from child 1  ");
}

    {
        System.out.println("sencond instance from child 1  ");
    }



}
