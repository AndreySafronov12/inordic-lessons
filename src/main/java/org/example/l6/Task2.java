package org.example.l6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов: ");
        int num = new Scanner(System.in).nextInt();

        List<Integer> list = getArray(num);

        getAvrgMinMax(list);
    }

    public static List<Integer> getArray (int a) {
        List<Integer> list = new ArrayList<> ();
        var scanner = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            System.out.print("Введите [" + i + "] элемент: ");
            list.add(scanner.nextInt());
        }
        return list;
    }

    public static void getAvrgMinMax (List<Integer> list) {
        int sum = 0;
        int min = list.get(0);
        int max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            if (list.get(i) < min) min = list.get(i);
            if (list.get(i) > max) max = list.get(i);
        }

        System.out.println("Среднее арифметическое: " + (double) sum / (double) list.size());
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }
}
