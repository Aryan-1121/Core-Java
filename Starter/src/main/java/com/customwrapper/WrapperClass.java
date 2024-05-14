package com.customwrapper;

public class WrapperClass {
    private int i ;

    public WrapperClass(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

//    just override the toString method and send the new data (by default it sends reference )
    @Override
    public String toString(){
        return Integer.toString(i);
    }


}
