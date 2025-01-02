package org.example.multithreadings;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Result from task";
        };

        Future<String> future = executorService.submit(task);

        System.out.println("Task submitted...");
        System.out.println("Task result: " + future.get()); // Bloque jusqu'à ce que la tâche soit terminée.

        executorService.shutdown();
    }
}
