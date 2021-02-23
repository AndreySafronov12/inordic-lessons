package org.example.l7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueArray {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов: ");
        int num = new Scanner(System.in).nextInt();

        List<Integer> list = inputArray(num);

        System.out.print("Быстрая сортировка: ");
        System.out.println(quickSort(list, 0, list.size() - 1));

        System.out.print("Сортировка методом пузырька: ");
        System.out.println(getSortList(list));

        System.out.print("Удаление повторяющихся элементов из отсортированного списка :");
        System.out.println(returnSetList(quickSort(list, 0, list.size() - 1)));

        System.out.print("Уникальные элементы списка без сортировки: ");
        System.out.println(getUniqueList(list));
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
            boolean flag = false;
            for (int j = 0; j < uniqueList.size(); j++) {
                if (list.get(i) == uniqueList.get(j)) flag = true;
            }
            if (!flag) uniqueList.add(list.get(i));
        }
        return uniqueList;
    }

    public static List<Integer> getSortList (List<Integer> list) {
        List<Integer> tempSortList = new ArrayList<>(list);
        for (int i = 0; i < (tempSortList.size() - 1); i++) {
            for (int j = i + 1; j < tempSortList.size(); j++) {
                if (tempSortList.get(j) < tempSortList.get(i)) {
                    int swap = tempSortList.get(i);
                    tempSortList.set(i, tempSortList.get(j));
                    tempSortList.set(j, swap);
                }
            }
        }
        return tempSortList;
    }

    public static List<Integer> quickSort(List<Integer> list, int low, int high) {
        List<Integer> sortList = new ArrayList<>(list);
        if (sortList.size() == 0) return sortList;
        if (low >= high) return sortList;

        int middle = low + (high - low) / 2;
        int sup = sortList.get(middle);

        int i = low;
        int j = high;
        while (i <= j) {
            while (sortList.get(i) < sup) i++;
            while (sortList.get(j) > sup) j--;

            if (i <= j) {
                int temp = sortList.get(i);
                sortList.set(i, sortList.get(j));
                sortList.set(j, temp);
                i++;
                j--;
            }
        }

        if (low < j) sortList = quickSort(sortList, low, j);
        if (high > i) sortList = quickSort(sortList, i, high);
        return sortList;
    }

    public static List<Integer> returnSetList(List<Integer> list) {
        List<Integer> tempList = new ArrayList<>();
        int temp = list.get(0);
        tempList.add(list.get(0));
        for(Integer a: list) {
            if (temp != a) {
                tempList.add(a);
                temp = a;
            }
        }
        return tempList;
    }
}
