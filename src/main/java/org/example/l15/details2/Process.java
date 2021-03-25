package org.example.l15.details2;

public class Process implements Runnable {
    private Details details;

    public Process(Details details) {
        this.details = details;
    }

    @Override
    public void run() {
        for(int i = 0;i < 4; i++) {
            details.getCountDetails().incrementAndGet();
            System.out.println(details.getCountDetails());
        }
    }
}
