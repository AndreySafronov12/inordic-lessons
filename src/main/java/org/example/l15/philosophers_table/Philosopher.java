package org.example.l15.philosophers_table;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    private String name;
    private Fork leftFork;
    private Fork rightFork;
    public static Semaphore allForks = new Semaphore(5);

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
    }

    public void think() {

    }

    @Override
    public void run() {
        //System.out.println(this.name + " решил поесть");

        do {
            try {
                allForks.acquire(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            /*

            if ((leftFork.getIsTaken().tryAcquire())) {
                try {
                    rightFork.getIsTaken().acquire();
                    System.out.println(this.name + " занял правую вилку");
                    leftFork.getIsTaken().acquire();
                    System.out.println(this.name + " занял левую вилку");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eat();
            }
            if ((rightFork.getIsTaken().tryAcquire())) {
                try {
                    leftFork.getIsTaken().acquire();
                    System.out.println(this.name + " занял левую вилку");
                    rightFork.getIsTaken().acquire();
                    System.out.println(this.name + " занял правую вилку");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eat();
            }

             */

            if ((leftFork.getIsTaken().availablePermits() == 1) && (rightFork.getIsTaken().availablePermits() == 1)) {
                try {

                    leftFork.getIsTaken().acquire();
                    System.out.println(this.name + " занял левую вилку");
                    rightFork.getIsTaken().acquire();
                    System.out.println(this.name + " занял правую вилку");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eat();
            }

            allForks.release(2);

        } while ((leftFork.getIsTaken().availablePermits() != 1) && (rightFork.getIsTaken().availablePermits() != 1));

    }
}
