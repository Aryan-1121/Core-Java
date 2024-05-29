package com.staticinstanceblock;

public class First {

    {
        System.out.println("first instance from 1st class ");
    }


    static {
        System.out.println("static form First class");
    }

    First(){
        System.out.println("constructor from 1st class");
    }

    {
        System.out.println("second instance from 1st class ");
    }

}
