package com.apple;

public class SecondClass extends SimpleClass{
    int a ;
    public SecondClass(int a ){
//        super();
////both this and super needs to be the first statment in a constructor so we cant use them together
//        this();
        this.a = a ;
        System.out.println("a from SecondClass constructor : "+ a);

    }
    public SecondClass(){

        System.out.println("this ;"+this);

    }
    public void display(){
        System.out.println(a);
    }


}
