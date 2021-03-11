package org.example.l11;

import java.util.*;

public class ClassWork11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 46, 67, 56);


        for (Integer b: list) {
            System.out.println(b);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            System.out.println(a);
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"aaa");
        for (int i = 1; i <= map.size(); i++) {
            System.out.println(map.get(i));
        }

        System.out.println("1 способ: ");

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("2 способ: ");

        Iterator<Map.Entry<Integer, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> pair = iterator1.next();
            Integer key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
