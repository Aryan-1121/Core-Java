package com.multithreading;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

class DemoRunnable implements Runnable{

    @Override
    public void run(){
        System.out.println("this is Demo runnable = "+ Thread.currentThread().getName());
    }
}
class DemoThread extends Thread{


    @Override
    public void run(){

        System.out.println("this is demoThread - > "+ Thread.currentThread().getName());
    }
}

public class Demo1 {
    public static void main(String[] args) {

        DemoThread demoThread = new DemoThread();
        demoThread.start();


        DemoRunnable demoRunnable = new DemoRunnable();
        Thread t1 = new Thread(demoRunnable);
        t1.start();


    }
}
