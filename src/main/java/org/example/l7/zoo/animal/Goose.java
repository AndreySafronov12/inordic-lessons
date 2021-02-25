package org.example.l7.zoo.animal;

import java.util.Random;

public class Goose extends Animal{
    public Goose(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("га-га-га-га");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " летает");
    }

    @Override
    public void action() {

        int choice = new Random().nextInt(3);

        switch (choice) {
            case 0:
                say();
                break;
            case 1:
                move();
                break;
            case 2:
                eat("корм");
                break;
        }
    }
}
