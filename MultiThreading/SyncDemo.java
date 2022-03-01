package com.MultiThreading;

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =1;i<=1000;i++)
                {
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =1;i<=1000;i++)
                {
                    c.increment();
                }
            }
        });


        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}

class Counter{
    int count;
    public synchronized void increment(){ //Synchronize keyword will make sure that only one thread is accessing this method and let wait other threads to execute it.
        count++;
    }

}
