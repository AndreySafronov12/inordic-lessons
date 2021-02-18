package org.example.l6;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        /*
        int [] massive = new int[8];
        int [] massive2 = new int[8];

        for (int i : massive) massive [i] = new Random().nextInt(8);

        for (int i : massive2) massive2 [i] = new Random().nextInt(8);

         */
        int [] massive = {1, 1, 1, 1, 1, 1, 1, 8};
        int [] massive2 = {8, 1, 1, 1, 1, 1, 1, 1};

        int check = 0;
        int check2 = 0;
        for (int i = 0; i < massive.length; i++) {
            check = 0;
            for (int j = 0; j < massive2.length; j++) {
                if (massive[i] == massive2[j]) check++;
            }
            if (check >= 1) check2++;

        };
        if (check2 == 8) System.out.println("yes");
        else System.out.println("no");
    }
}
