package org.example.multithreadings;

class BonjourThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Bonjour !");
            try {
                Thread.sleep(500); // Pause de 500 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CommentThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Comment ça va ?");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Thread thread1 = new BonjourThread();
        Thread thread2 = new CommentThread();

        thread1.start();

    /*    try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        thread2.start();
    }
}
