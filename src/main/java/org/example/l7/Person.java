package org.example.l7;

public class Person {
    private String name;
    private Integer age;
    private Integer height;
    private Character sex;

    // alt + insert - добавить
    public Person(String name, Integer age, Integer height, Character sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.sex = sex;
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

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public void kiss(Person o) {
        System.out.println(this.getName() + " целуется с " + o.getName());
    }
}
