package org.example.l14;

public class MultiThreadingMain extends Thread {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        man.start();
        woman.start();
    }

    static class Man extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++){
                System.out.println("Hello " + i);
            }
        }
    }

    static class Woman extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++){
                System.out.println("Bye " + i);
            }
        }
    }
}
