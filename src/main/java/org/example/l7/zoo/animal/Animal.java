package org.example.l7.zoo.animal;

import java.util.Objects;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("...");
    }

    public void sleep(int n) {
        System.out.println(this.getName() + " проспал(-а) " + n + " час(-а/-ов)");
    }

    public void eat(String food) {
        System.out.println(this.getName() + " съел " + food);
    }

    public void move() {
        System.out.println(this.getName() + " ходит");
    }

    public void action() {
        System.out.println(this.getName() + " сидит в клетке");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
