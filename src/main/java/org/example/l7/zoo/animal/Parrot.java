package org.example.l7.zoo.animal;

import java.util.Random;

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }

    public void say(String sayToParrot) throws InterruptedException {
        int n = new Random().nextInt(10);
        for (int i = 0; i < n; i++) {
            System.out.println("- " + sayToParrot);
            Thread.sleep(500);
        }
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " ползет");
    }

    @Override
    public void action() {
        System.out.println(this.getName() + " свисает с ветки");
    }
}
