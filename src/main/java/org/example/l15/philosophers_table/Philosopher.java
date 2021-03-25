package org.example.l15.philosophers_table;

public class Philosopher extends Thread {
    private String name;
    private Fork leftFork;
    private Fork rightFork;

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

        if (rightFork.getIsTaken().availablePermits() == 0) {
            try {
                rightFork.getIsTaken().acquire();
                System.out.println(this.name + " занял правую вилку");
                leftFork.getIsTaken().acquire();
                System.out.println(this.name + " занял левую вилку");


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            try {

                leftFork.getIsTaken().acquire();
                System.out.println(this.name + " занял левую вилку");
                rightFork.getIsTaken().acquire();
                System.out.println(this.name + " занял правую вилку");


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        eat();

        //else System.out.println(this.name + " ждет вилки");



    }
}
