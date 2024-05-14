package com.aggregation;

public class Square {
    int a ;
    Perimeter perimeter;
    public Square(int a ){
        this.a =a ;
    }
    public void showPerimeter (){
        int peri = perimeter.getPerimeter(a);
        System.out.println( peri );
    }
}
