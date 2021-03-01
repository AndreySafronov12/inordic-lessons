package org.example.l7.zoo.animal;

import org.example.l7.zoo.exceptions.SwimmException;
import org.example.l7.zoo.interfaces.Swimming;

import java.util.Random;
import java.util.Scanner;

public class Goose extends Animal implements Swimming {
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

    @Override
    public void swim(String place) {
        place = new Scanner(System.in).nextLine();
        if (!place.equalsIgnoreCase("пруд"))
            try {
                throw new SwimmException("Тут нельзя плавать!!!");
            }   catch (SwimmException e) {
                System.out.println("rerer");
            }
        System.out.println("Плавает");
    }
}
