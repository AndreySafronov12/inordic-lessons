package org.example.l7.zoo.animal;

import org.example.l7.zoo.interfaces.Flying;

import java.util.Date;

public class Owl extends Animal implements Flying {
    public Owl(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("ууух-уууух-уууух");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " летает");
    }

    @Override
    public void action() {
        Date date = new Date();
        if ((date.getHours() > 22) || (date.getHours() < 7)) this.move();
        else this.sleep(date.getHours() - 7);
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " умеет летать");
    }

    @Override
    public void eat(String food) {
        System.out.println(this.getName() + " съел " + food);
    }
}
