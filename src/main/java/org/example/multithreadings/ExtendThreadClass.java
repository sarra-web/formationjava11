package org.example.multithreadings;


// Not flexible
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ExtendThreadClass {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread
    }
}

