package org.example.l7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class uniqueArray {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов: ");
        int num = new Scanner(System.in).nextInt();

        List<Integer> list = inputArray(num);

        System.out.print("Уникальные элементы списка: ");
        System.out.println(getUniqueList(list));

        System.out.print("Отсортированный список: ");
        System.out.println(getSortList(list));
    }

    public static List<Integer> inputArray(int a) {
        List<Integer> list = new ArrayList<>();
        var scanner = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            System.out.print("Введите [" + i + "] элемент: ");
            list.add(scanner.nextInt());
        }
        return list;
    }

    public static List<Integer> getUniqueList (List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int temp = 0;
            for (int j = 0; j < uniqueList.size(); j++) {
                if (list.get(i) == uniqueList.get(j)) temp++;
            }
            if (temp == 0) uniqueList.add(list.get(i));
        }
        return uniqueList;
    }

    public static List<Integer> getSortList (List<Integer> list) {
        for (int i = 0; i < (list.size() - 1); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(i)) {
                    int swap = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, swap);
                }
            }
        }
        return list;
    }
}
