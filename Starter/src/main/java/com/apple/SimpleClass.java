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

    public String getaNmae() {
        return aName;
    }

    public void setaNmae(String aNmae) {
        this.aName = aNmae;
    }

    protected String getValue(){
        return "this is protected method from Simple class";
    }
}
