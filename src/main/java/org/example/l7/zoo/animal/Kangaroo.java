package org.example.l7.zoo.animal;

import org.example.l7.zoo.exceptions.EatException;

public class Kangaroo extends Animal {
    public Kangaroo(String name) {
        super(name);
    }

    public Kangaroo(String name, boolean kangarooBag) {
        super(name);
        this.kangarooBag = kangarooBag;
    }

    private boolean kangarooBag;

    @Override
    public void say() {
        System.out.println("кхррруууу");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " прыгает");
    }

    @Override
    public void action() {
        System.out.println(this.getName() + " боксирует");
    }

    public void getKangarooBagStatus() {
        if (kangarooBag) System.out.println("В сумке у " + this.getName() + " сидит детеныш");
        else System.out.println("Сумка у " + getName() + " пустая");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("шоколадка"))
            throw new EatException("Нельзя давать шоколадку!");
        else
            System.out.println(this.getName() + " съел " + food);
    }
}
