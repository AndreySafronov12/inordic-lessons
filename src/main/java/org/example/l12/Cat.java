package org.example.l12;

import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private String name;
    private Integer age;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Cat o) {
        return this.getName().compareTo(o.getName());
        /*
        if(this.getAge() > o.getAge()) return 1;
        else if (this.getAge() < o.getAge()) return -1;
        else return 0;

         */
        //return this.getAge().compareTo(o.getAge());
    }
}
