package org.example.l15.philosophers_table;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    private String name;
    private Fork leftFork;
    private Fork rightFork;
    public static Semaphore blockForks = new Semaphore(1);
    private int hungry = 1;

    public Philosopher(String name, Fork leftFork, Fork rightFork) {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void eat() {
        System.out.println(this.name + " сел кушать" + leftFork.getIsTaken().availablePermits() + rightFork.getIsTaken().availablePermits());

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(this.name + " поел и освободил вилки");

        leftFork.getIsTaken().release();
        rightFork.getIsTaken().release();
        hungry--;
    }

    public void think() {
        System.out.println(this.name + " решил поразмышлять");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {

        do {
            try {
                blockForks.acquire();
                if ((leftFork.getIsTaken().availablePermits() == 1) && (rightFork.getIsTaken().availablePermits() == 1)) {

                    leftFork.getIsTaken().acquire();
                    System.out.println(this.name + " занял левую вилку");
                    rightFork.getIsTaken().acquire();
                    System.out.println(this.name + " занял правую вилку");
                    blockForks.release();
                    eat();
                } else {
                    blockForks.release();
                    //think();
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (hungry > 0);
    }
}
