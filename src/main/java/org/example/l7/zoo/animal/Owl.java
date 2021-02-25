package org.example.l7.zoo.animal;

import java.util.Date;

public class Owl extends Animal {
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
}
