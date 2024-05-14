package com.multithreading;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Data {
    public static void main(String[] args) {

        int n = Runtime.getRuntime().availableProcessors();
        System.out.println(n );

        ExecutorService executorService = Executors.newFixedThreadPool(n);
        List<Future<Void>> futures = new CopyOnWriteArrayList<>();
    }
}
