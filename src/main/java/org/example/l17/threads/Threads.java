package org.example.l17.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(() -> {
            System.out.println("Hello!");
            executorService.execute(() -> {
                System.out.println("Hello2!!!");
            });
            executorService.shutdown();
        });


    }

}
