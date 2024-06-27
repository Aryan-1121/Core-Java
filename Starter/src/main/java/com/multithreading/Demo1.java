package com.multithreading;

class DemoRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("this is DemoRunnable = "+ Thread.currentThread().getName());
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
        Thread runnableThread = new Thread(demoRunnable);
        runnableThread.start();


    }
}
