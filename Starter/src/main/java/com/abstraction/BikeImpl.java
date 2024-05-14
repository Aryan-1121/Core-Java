package com.abstraction;

public class BikeImpl implements bike{

    BikeImpl(){
        this.gear();
        System.out.println(bike.gears);
    }

    @Override
    public void gear(){
        System.out.println(4);
    }


    public static void main(String [] args){
        BikeImpl bike = new BikeImpl();
    }

}
