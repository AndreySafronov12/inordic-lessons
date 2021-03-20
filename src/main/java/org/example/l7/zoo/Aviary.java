package org.example.l7.zoo;

import org.example.l7.zoo.animal.Animal;
import org.example.l7.zoo.exceptions.AviaryOverflowException;
import org.example.l7.zoo.exceptions.NoSuchAnimalException;
import org.example.l7.zoo.exceptions.NotUniqueAnimalException;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Aviary {
    private String nameOfAviary;
    private int aviarySize;
    private final HashSet<Animal> animalsInTheAviary;

    public Aviary(String aviaryName, int aviarySize) {
        this.nameOfAviary = aviaryName;
        this.aviarySize = aviarySize;
        animalsInTheAviary = new HashSet<>();
    }

    public String getNameOfAviary() {
        return nameOfAviary;
    }

    public void setNameOfAviary(String nameOfAviary) {
        this.nameOfAviary = nameOfAviary;
    }

    public int getAviarySize() {
        return aviarySize;
    }

    public void setAviarySize(int aviarySize) {
        this.aviarySize = aviarySize;
    }

    public void addAnimalToAviary(Animal animal) {
        if (this.animalsInTheAviary.size() == this.aviarySize) {
            try {
                throw new AviaryOverflowException("Вольер переполнен!");
            }
            catch (AviaryOverflowException e) {
                System.err.println(e);
            }
        }
        else if (this.animalsInTheAviary.contains(animal)) {
            try {
                throw new NotUniqueAnimalException("Это животное уже есть в вольере!");
            }
            catch (NotUniqueAnimalException e) {
                System.err.println(e);
            }
        }
        else this.animalsInTheAviary.add(animal);
    }

    public void deleteAnimalFromAviary(Animal animal) {
        if (!animalsInTheAviary.contains(animal))
            try {
                throw new NoSuchAnimalException("Такого животного в вольере нет!");
            }
            catch (NoSuchAnimalException e) {
                System.err.println(e);
            }
        else this.animalsInTheAviary.remove(animal);
    }

    public void getAnimalsFromAviary() {
        System.out.println(this.animalsInTheAviary);
    }

    @Override
    public String toString() {
        return "Aviary{" +
                "nameOfAviary='" + nameOfAviary + '\'' +
                ", aviarySize=" + aviarySize +
                ", animalsInTheAviary=" + animalsInTheAviary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aviary aviary = (Aviary) o;
        return Objects.equals(nameOfAviary, aviary.nameOfAviary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfAviary);
    }
}
