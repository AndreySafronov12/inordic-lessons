package org.example.l14;

public class ClassWork14 {
    Animal cat = new Animal() {
        @Override
        public void say(String s) {
            System.out.println(s);
        }
    };

    Animal dog = (s) -> System.out.println("ruf");

    Animal frog = new Animal() {
        @Override
        public void say(String s) {
            System.out.println(s);
        }

        @Override
        public void run() {
            System.out.println("jumping");
        }
    };

    Animal elephant = System.out::println;

    public static void main(String[] args) {
        Animal bird = System.out::println;
        bird.say("hallo");
        bird.run();
        bird.sleep();

        Animal parrot = System.out::println;


        parrot.say("blablabla");


    }

    Car audi = new Car() {
        @Override
        public void move() {
            System.out.println("beep-beep");
        }
    };

    Car bmw = () -> {

    };
}

@FunctionalInterface
interface Animal{
    void say(String s);
    default void run() {
        System.out.println("running");
    }
    default void sleep() {
        System.out.println("sleep");
    }
}


interface Car{
    void move();
}

@FunctionalInterface
interface Driver{
    void say();
}
