package com.collection.maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map <Integer, String> map = new HashMap<>();
        map.put(1,"hero");
        map.put(6,"villain");
        map.put(3,"joker");
        map.put(4,"supermao");
        map.put(1,"batmman");


        System.out.println(map);
        for(int key : map.keySet()){
            System.out.println(key+ "  "+ map.get(key));
        }
//        System.out.println(map.get(3));

    }
}
