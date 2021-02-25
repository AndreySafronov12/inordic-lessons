package org.example.l8.party;

public class Person extends  Visitors implements Music, Jumping {
    private String name;
    private String gift;

    public Person(String gift, String name, String gift1) {
        super(gift);
        this.name = name;
        this.gift = gift1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void sendGift() {
        System.out.println("Подарок");
    }

    @Override
    public void playMusic() {
        System.out.println("Play some music");
    }

    @Override
    public void jumping() {
        System.out.println("Jump on the sofa");
    }
}
