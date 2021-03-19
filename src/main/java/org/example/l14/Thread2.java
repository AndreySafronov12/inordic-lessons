package org.example.l14;

public class Thread2 {
    public static void main(String[] args) {
        Biber biber = new Biber();
        Selena selena = new Selena();

        Thread biberThread = new Thread(biber);
        Thread selenaThread = new Thread(selena);
        biberThread.setDaemon(true);
        biberThread.start();
        selenaThread.start();

    }

    public static class Biber implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++){
                System.out.println("Hello Selena " + i);
            }
        }
    }

    public static class Selena implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++){
                System.out.println("Hello  Biber " + i);
            }
        }
    }
}
