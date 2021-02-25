package org.example.l7.zoo.animal;

public class Snake extends Animal {
    public Snake(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("шшшшшшшш");
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
