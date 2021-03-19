package org.example.l13;

import java.util.Objects;

public class Puppy {
    private String name;
    private int age;
    private String breed;

    public Puppy(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Puppy puppy = (Puppy) o;
        return age == puppy.age &&
                Objects.equals(name, puppy.name) &&
                Objects.equals(breed, puppy.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed);
    }
}
