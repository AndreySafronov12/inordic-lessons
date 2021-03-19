package org.example.l14;

public class Thread3 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        Thread catThread = new Thread(cat);
        Thread dogThread = new Thread(dog);

        Camel camel = new Camel();
        Mule mule = new Mule();

        catThread.start();
        dogThread.start();
        camel.start();
        mule.start();
    }

    public static class Cat implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++){
                System.out.println("Meow " + i);
            }
        }
    }

    public static class Dog implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++){
                System.out.println("Ruff " + i);
            }
        }
    }

    public static class Camel extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++){
                System.out.println("Yeeee " + i);
            }
        }
    }

    public static class Mule extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++){
                System.out.println("Ia-ia " + i);
            }
        }
    }


}


