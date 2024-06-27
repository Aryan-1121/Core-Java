package com.apple;

public class SimpleClass {
    int a;
    String aName;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    protected String getValue(){
        return "this is protected method from Simple class";
    }
}
