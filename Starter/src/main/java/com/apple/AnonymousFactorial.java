package com.apple;

public class AnonymousFactorial {
    private int n ;

    public void setN(int n){
        this.n = n;
    }

    public int factorial(int n ){
        int fact =1;
        for(int i=n ; i>1; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
