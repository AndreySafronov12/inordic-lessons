package org.example.l6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson6 {
    public static void main(String[] args) {
        int [] massive = new int[5];
        int [] massive2 = {4, 5, 7, 10, 4};
        int [] massive3 = massive2;
        massive[0] = 45;
        massive3[3] = 33;
        for (int i = 0; i < massive.length; i++) massive[i] = i;
        for (int i = 0; i < massive.length; i++) System.out.println(massive[i]);
        for (int j : massive2) System.out.println(j);

        String str = "aaa";
        String str1 = str;
        str1 = "www";
        System.out.println(str);


        List<Integer> list = new LinkedList<>();
        List<Integer> list2 = new ArrayList<>(1000);
        list2.add(4);
        list2.add(6);
        int v = list2.get(0);
        list2.remove(0);
        list2.add(7);
        list2.set(0, 5);
        System.out.println(list2.size());

    }
}
