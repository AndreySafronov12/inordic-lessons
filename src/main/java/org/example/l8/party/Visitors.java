package org.example.l8.party;

public abstract class Visitors {
    public Visitors(String gift) {
        this.gift = gift;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    private String gift;
    public abstract void sendGift();
    protected void  say() {
        System.out.println("С Днем Рождения!");
    }
}
