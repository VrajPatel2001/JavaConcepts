package com.MultiThreading;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        //obj1.start(); //If this takes time to execute, other statements will run simultaneously.
       // obj2.start();


        //We have default thread which is main thread. Which is also running with the other threads.
        //In case of Runnable interface, we can use following code:
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("Hi Thread"); //Can give name to thread
        t2.setName("Hello Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority()); //Priority list goes from 1 to 10. 1 means the least priority.
        System.out.println(t2.getPriority()); //Priority list goes from 1 to 10. 1 means the least priority.

        //this will call the thread's run method.
        t1.start();
        t2.start();

        //System.out.println("Bye"); // This will be also executed with the other threads as this is in the main thread.

        t1.join(); //It will make main thread to wait to complete this thread and will join again main thread. After then main thread will execute.
        t2.join();

        System.out.println(t1.isAlive()); //isAlive method checks that thread is alive or not. After join method, it will give false.
        System.out.println("Bye");

/* With Runnable interface and Lambda expression.
        //Instead of create the classes for Hi and Hello, we can use Anonymous class.
        Runnable obj11 = ()->{
            for(int i =0;i<=5;i++)
            {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj12 = ()->{
            for(int i =0;i<=5;i++)
            {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t11 = new Thread(obj11);
        Thread t12 = new Thread(obj12);

        t11.start();
        t12.start();
*/

    }
}

class Hi extends Thread{ //Thread will make this class thread, and we have to call the method run which we want to run on multiple thread.
    public void run(){
        for(int i =0;i<=5;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Hello extends Thread{ //If we want to extend another class then we can use Runnable interface instead of Thread class.
    public void run(){
        for(int i =0;i<=5;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
