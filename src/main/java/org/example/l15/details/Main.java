package org.example.l15.details;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Detail detail = new Detail(new AtomicInteger(24));
        ProcessDetails process1 = new ProcessDetails(detail);
        ProcessDetails process2 = new ProcessDetails(detail);
        ProcessDetails process3 = new ProcessDetails(detail);
        ProcessDetails process4 = new ProcessDetails(detail);
        ProcessDetails process5 = new ProcessDetails(detail);
        ProcessDetails process6 = new ProcessDetails(detail);

        process1.start();
        process2.start();
        process1.join();
        process2.join();

        process3.start();
        process3.join();

        process4.start();
        process5.start();
        process4.join();
        process5.join();

        process6.start();
    }
}
