package org.example.multithreadings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(6);

        executor.submit(() -> {
            System.out.println("Task executed by: " + Thread.currentThread().getName());
            System.out.println("Task executed by: " + Thread.currentThread().getName());

        });

        executor.shutdown();
    }
}


