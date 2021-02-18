package org.example.l6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 3, 6, 10, 8);
        int sum = 0;
        int min = list.get(0);
        int max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
            if (list.get(i) < min) min = list.get(i);
            if (list.get(i) > max) max = list.get(i);
        }
        System.out.println(sum / list.size());
        System.out.println(min);
        System.out.println(max);


    }
}
