package com.fzz.thread;

public class ImplementRunable implements Runnable {


    private String threadName;

    ImplementRunable(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
    }


    public static void main(String[] args) {
        Thread thread1 = new Thread(new ImplementRunable("thread A"));
        Thread thread2 = new Thread(new ImplementRunable("thread B"));
        thread1.start();
        thread2.start();
    }
}
