package com.ball;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ankit","Pulkit","Suresh","Abhay");

//        Filter the list of names start with alphabet 'A'

//        List<String> newList  = list.stream().filter(element -> element.charAt(0)== 'A').collect(Collectors.toList());
    // no need of collect(Collectors.toList()) -> direct toList
        List<String> newList  = list.stream().filter(element -> element.charAt(0)== 'A').toList();

        System.out.println(newList);


    }
}