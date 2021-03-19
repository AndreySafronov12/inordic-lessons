package org.example.l13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogList = Arrays.asList(new Dog("Рекс", 5, "Лабрадор", new Puppy("Рексович", 2, "Лабрадор")),
                new Dog("Бобик", 4, "Такса", new Puppy("Бобикович", 1, "Такса")),
                new Dog("Шарик", 9, "Овчарка", new Puppy("Шарикович", 3, "Овчарка")));

        dogList
                .stream()
                .parallel()
                .sorted(Comparator.comparing(o -> o.getPuppy().getName()))
                .forEach(System.out::println);

        System.out.println();

        dogList
                .stream()
                .sorted(Comparator.comparingInt(Dog::getAge))
                .forEach(System.out::println);


        System.out.println();

        dogList
                .stream()
                .sorted(Comparator.comparing(o -> o.getPuppy().getName()))
                .forEach(System.out::println);



    }
}
