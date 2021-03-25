package org.example.l15.threads_operator;

public class WaitThread extends Thread {
    @Override
    public void run() {
        try {
            join();
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
    }
}
