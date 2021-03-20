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

        //Создаем массив вольеров

        AviaryArray aviaryArray = new AviaryArray(3);

        aviaryArray.addAviary(aviary1);

        Aviary aviary2 = new Aviary("Вольер №2", 4);
        Aviary aviary3 = new Aviary("Вольер №3", 3);

        aviaryArray.addAviary(aviary2);
        aviaryArray.addAviary(aviary3);

        aviaryArray.addAnimal(vasily,aviary2);
        aviaryArray.addAnimal(liza,aviary2);
        aviaryArray.addAnimal(igor,aviary2);
        aviaryArray.getAnimalsFromAviaryArray(aviary2);

        Aviary aviary4 = new Aviary("Вольер №4", 3);

        aviaryArray.addAviary(aviary4);
        aviaryArray.addAnimal(igor, aviary4);

        aviaryArray.deleteAnimal(vasily, aviary1);

        aviaryArray.getAviaries();
        aviaryArray.sortAviaryArrayBySize();
        aviaryArray.getAviaries();
    }
}
