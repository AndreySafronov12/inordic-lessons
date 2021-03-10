package org.example.l7.zoo;

import org.example.l7.zoo.animal.Animal;
import org.example.l7.zoo.exceptions.AviaryOverflowException;
import org.example.l7.zoo.exceptions.NoSuchAviaryException;

import java.util.ArrayList;
import java.util.List;

public class AviaryArray {
    private int aviariesSize;
    private final List<Aviary> aviaryArray;

    public AviaryArray(int aviariesSize) {
        this.aviariesSize = aviariesSize;
        aviaryArray = new ArrayList<>();
    }

    public int getAviariesSize() {
        return aviariesSize;
    }

    public void setAviariesSize(int aviariesSize) {
        this.aviariesSize = aviariesSize;
    }

    public void addAviary (Aviary aviary) {
        if (aviaryArray.size() == aviariesSize)
            try {
                throw new AviaryOverflowException("Больше вольеров сюда не влезет!");
            }
            catch (AviaryOverflowException e) {
                System.err.println(e);
            }
        else aviaryArray.add(aviary);
    }

    public void deleteAviary (Aviary aviary) {
        if (!aviaryArray.contains(aviary))
            try {
                throw new NoSuchAviaryException("Такого вольера в массиве не существует!");
            }
            catch (NoSuchAviaryException e) {
                System.err.println(e);
            }
        else this.aviaryArray.remove(aviary);
    }

    public void addAnimal (Animal animal, Aviary aviary) {
        int index = aviaryArray.indexOf(aviary);
        if (index == -1) {
            try {
                throw new NoSuchAviaryException("Такого вольера в массиве не существует!");
            }
            catch (NoSuchAviaryException e) {
                System.err.println(e);
            }
        } else aviaryArray.get(index).addAnimalToAviary(animal);
    }

    public void deleteAnimal (Animal animal, Aviary aviary) {
        int index = aviaryArray.indexOf(aviary);
        if (index == -1) {
            try {
                throw new NoSuchAviaryException("Такого вольера в массиве не существует!");
            }
            catch (NoSuchAviaryException e) {
                System.err.println(e);
            }
        } else aviaryArray.get(index).deleteAnimalFromAviary(animal);
    }

    public void getAnimalsFromAviaryArray(Aviary aviary) {
        int index = aviaryArray.indexOf(aviary);
        if (index == -1) {
            try {
                throw new NoSuchAviaryException("Такого вольера не существует!");
            }
            catch (NoSuchAviaryException e) {
                System.err.println(e);
            }
        } else aviaryArray.get(index).getAnimalsFromAviary();
    }
}
