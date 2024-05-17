package com.exceptions;

public class Student {
    public int mayThrowError(){
        try{
            System.out.println("hellot form try ");
            return 50/0;
        }catch (Exception e ){
            System.out.println("yoo "+e);
            return -1;
        }
        finally {
            System.out.println("thisis finally ");
//            return 3;
        }
    }
}
