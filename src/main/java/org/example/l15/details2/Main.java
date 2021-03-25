package org.example.l15.details2;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Process process = new Process(new Details(new AtomicInteger(0)));
        Thread processThread1 = new Thread(process);
        Thread processThread2 = new Thread(process);
        Thread processThread3 = new Thread(process);
        Thread processThread4 = new Thread(process);
        Thread processThread5 = new Thread(process);
        Thread processThread6 = new Thread(process);

        processThread1.start();
        processThread2.start();
        processThread1.join();
        processThread2.join();


        processThread3.start();
        processThread3.join();

        processThread4.start();
        processThread5.start();
        processThread4.join();
        processThread5.join();

        processThread6.start();
    }
}
