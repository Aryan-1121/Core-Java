package com.objeccloninig;
//implement clonable
//wirte a clone method of return type object which returns super.clone();  => clone from object class

public class Student implements  Cloneable{
    private int roll;
    private  String name ;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }

    public Object clone(){
        try {
            return super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
            throw  new AssertionError(e);
        }
    }


}
