package com.MultiThreading;

public class InterThread {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}

class Q{
    int num;
    boolean valueSet = false;

    public synchronized void put(int num) throws InterruptedException { //if you use wait method in any method, that method should be synchronized.
        while(valueSet)
        {
            wait();
        }
        System.out.println("Put:"+ num);
        this.num = num;
        valueSet = true;
        notify(); //This is important to continue the process. Because it wakes up the current thread.
    }
    public synchronized void get() throws InterruptedException {
        while(!valueSet)
        {
            wait();
        }
        System.out.println("Get"+num);
        valueSet = false;
        notify();
    }

}

class Producer implements Runnable
{
    Q q;

    public Producer(Q q){
        this.q = q;
        Thread t = new Thread(this,"Producer");
        t.start();
    }

    @Override
    public void run() {
        int i=0;
        while(true)
        {
            try {
                q.put(i++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {Thread.sleep(1000);} catch (Exception e){}
        }
    }
}

class Consumer implements Runnable{
    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }

    @Override
    public void run() {
        while(true){
            try {
                q.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {Thread.sleep(2000);} catch (Exception e){}
        }
    }
}

