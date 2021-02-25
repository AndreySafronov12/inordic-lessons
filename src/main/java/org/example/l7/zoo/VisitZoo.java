package org.example.l7.zoo;

import org.example.l7.zoo.animal.*;

import java.util.Scanner;


public class VisitZoo {
    public static void main(String[] args) throws InterruptedException {
        Goose martin = new Goose("Мартин");
        martin.action();

        Lion newBornLion = new Lion("???");
        newBornLion.setName("Симба");
        newBornLion.action();
        newBornLion.attack(martin);

        Owl hedvig = new Owl("Хедвиг");
        hedvig.action();

        Kangaroo chloe = new Kangaroo("Хлоя", true);
        chloe.getKangarooBagStatus();

        Parrot kesha = new Parrot("Кеша");
        System.out.print("Скажите что-нибудь попугаю " + kesha.getName() + ":");
        kesha.say(new Scanner(System.in).nextLine());
    }
}
