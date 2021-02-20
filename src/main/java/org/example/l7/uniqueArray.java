package org.example.l7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class uniqueArray {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов: ");
        int num = new Scanner(System.in).nextInt();

        List<Integer> list = inputArray(num);
        List<Integer> uniqueList = new ArrayList<>();
        List<Integer> sortList = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            int temp = 0;
            for (int j = 0; j < uniqueList.size(); j++) {
                if (list.get(i) == uniqueList.get(j)) temp++;
            }
            if (temp == 0) uniqueList.add(list.get(i));

        }

        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(0);
            for (int j = i; j < uniqueList.size(); j++) {
                if (list.get(i) == uniqueList.get(j)) temp++;
            }
            if (temp == 0) uniqueList.add(list.get(i));

        }

        System.out.println(uniqueList);

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
}
