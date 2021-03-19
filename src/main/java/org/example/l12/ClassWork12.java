package org.example.l12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassWork12 {
    public static void main(String[] args) {
        List<Cat> array = Arrays.asList(new Cat("Roman", 22), new Cat("Andrey", 3),
                new Cat("Maria", 1));

        Collections.sort(array, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                //return o1.getName().compareTo(o2.getName());

                if(o1.getAge() > o2.getAge()) return 1;
                else if (o1.getAge() < o2.getAge()) return -1;
                else return 0;
            }
        });

        // в java 8 - с лямбда выражением
        Collections.sort(array,((o1, o2) -> o1.getName().compareTo(o2.getName())));


        // в java - ссылка на метод
        Collections.sort(array, Comparator.comparing(Cat::getName));


        array.forEach(System.out::println);
    }
}
