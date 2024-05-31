package com.inheritance.runtime;

public class Main {
    public static void main(String[] args) {
//        Bike bike = new Honda();
//        System.out.println(bike.speed);


        Bike bike = new Honda(60);
        System.out.println(bike.speed);

    }
}
