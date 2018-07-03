package com.fzz.thread;

public class ExtendThread extends Thread{

    String name;

    ExtendThread(String threadName) {
        this.name=threadName;
    }

    public void run() {
        for (int i = 0; i < 100; ++i)
        {
            System.out.println("B thread "+this.name);
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        ExtendThread extendThread1 = new ExtendThread("A");
        ExtendThread extendThread2 = new ExtendThread("B");
        extendThread1.start();
        extendThread2.start();
    }

}
