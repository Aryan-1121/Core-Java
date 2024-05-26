package com.immutable;

public final class Mutable {
    private final int a;
    private final String name ;
    public Mutable(int a, String name){
        this.a = a;
        this.name= name;
    }


    public int getA(){
        return a;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Mutable{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }
}
