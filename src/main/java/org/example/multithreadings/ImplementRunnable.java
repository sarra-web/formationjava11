package org.example.multithreadings;


/**Plus pratique*/


class MyRunnable implements Runnable {
    private String a;

    public MyRunnable(String a) {
        this.a = a;
    }

    public void run() {

        System.out.println(a);
    }
}

public class ImplementRunnable {
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable("thread 1 started");
        MyRunnable myRunnable2 = new MyRunnable("thread 2 started");
        MyRunnable myRunnable3 = new MyRunnable("thread 3 started");

        new Thread(myRunnable1).start(); // Start the thread1
        new Thread(myRunnable2).start(); // Start the thread2
        new Thread(myRunnable3).start(); // Start the thread3

        //main thread action
    }
}

