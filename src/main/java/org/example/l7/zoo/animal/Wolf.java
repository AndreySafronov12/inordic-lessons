package org.example.l7.zoo.animal;

public class Wolf extends Animal {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("ууууууу-уууууууууу");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " бегает");
    }

    @Override
    public void action() {
        System.out.println(this.getName() + " сидит в конуре");
    }

    @Override
    public void eat(String food) {
        System.out.println(this.getName() + " съел " + food);
    }
}
