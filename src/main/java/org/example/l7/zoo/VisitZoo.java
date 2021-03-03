package org.example.l7.zoo;

import org.example.l7.zoo.animal.*;
import org.example.l7.zoo.exceptions.*;

import java.util.Scanner;


public class VisitZoo {
    public static void main(String[] args) {
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

        System.out.println("Где поплавать гусю по имени " + martin.getName() + "?");
        String place = new Scanner(System.in).nextLine();
        try {
            martin.swim(place);
        }
        catch (SwimmException e) {
            e.printStackTrace();
        }

        System.out.println("И дайте ему что-то поесть, только не давайте хлеб!");
        System.out.print("Еда для " + martin.getName() + ":");
        try {
            martin.eat(new Scanner(System.in).nextLine());
        }
        catch (EatException e) {
            System.err.println(e);
        }

        System.out.println("Уходим из зоопарка");
    }
}
