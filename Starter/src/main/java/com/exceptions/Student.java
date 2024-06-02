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

    //we can not directly use throw without throws ( bcs throws tells this method may throw an exception)
    public int get5() throws Exception {

//        throw new Exception("================== EXCEPTION OCCURED ==========");
        return 5;
    }
}
