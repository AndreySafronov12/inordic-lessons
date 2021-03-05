package org.example.l7.zoo;

import org.example.l7.zoo.animal.*;

public class VisitZoo2 {
    public static void main(String[] args) {
        Goose igor = new Goose("Игорь");

        Aviary aviary1 = new Aviary("Вольер №1", 2);
        aviary1.addAnimalToAviary(igor);

        Kangaroo liza = new Kangaroo("Лиза", true);
        aviary1.addAnimalToAviary(liza);


        aviary1.getAnimalsFromAviary();

        Wolf vasily = new Wolf("Вася");
        aviary1.addAnimalToAviary(vasily);

        aviary1.deleteAnimalFromAviary(igor);

        aviary1.addAnimalToAviary(liza);

        aviary1.getAnimalsFromAviary();
    }
}
