package org.example.l7.zoo.animal;

import org.example.l7.zoo.exceptions.EatException;
import org.example.l7.zoo.exceptions.SwimmException;
import org.example.l7.zoo.interfaces.Flying;
import org.example.l7.zoo.interfaces.Swimming;

import java.util.Random;
import java.util.Scanner;

public class Goose extends Animal implements Swimming, Flying {
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
        if (!place.equalsIgnoreCase("пруд"))
            throw new SwimmException("Тут нельзя плавать!!!");

        System.out.println("Плавает в " + place);
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " умеет летать");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("хлеб"))
            throw new EatException("Нельзя кормить гуся хлебом!");
        System.out.println(this.getName() + " съел " + food);
    }
}
