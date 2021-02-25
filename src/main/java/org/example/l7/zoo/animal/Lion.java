package org.example.l7.zoo.animal;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("ХРРРРРРРР");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " прогуливается");
    }

    @Override
    public void action() {
        System.out.println(this.getName() + " лежит в траве");
    }

    public void attack(Animal anotherAnimal) {
        System.out.println(this.getName() + " напал на " + anotherAnimal.getName());
    }
}
