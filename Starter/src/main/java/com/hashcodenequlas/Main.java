package com.hashcodenequlas;

public class Main {
    public static void main(String[] args) {
        Emp e1 = new Emp(1, "hero");
        Emp e2 = new Emp(1, "hero");

        System.out.println(e1 +"       "+ e2);
        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode()+"     "+ e2.hashCode());



    }
}
