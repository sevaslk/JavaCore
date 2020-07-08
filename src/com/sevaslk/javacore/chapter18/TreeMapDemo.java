package com.sevaslk.javacore.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> treeMap = new TreeMap<>();
        treeMap.put("Джон Доу", 3434.34);
        treeMap.put("Том Смит", 123.22);
        treeMap.put("Джейн Бейкер", 1378.00);
        treeMap.put("Тод Холл", 99.22);
        treeMap.put("Ральф Смит", -19.08);

        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        for (Map.Entry<String, Double> mEntry : set) {
            System.out.print(mEntry.getKey() + ": ");
            System.out.print(mEntry.getValue());
            System.out.println();
        }

        double balance = treeMap.get("Джон Доу");
        treeMap.put("Джон Доу", balance + 1001);
        System.out.print("Новый остаток на счете Джона До: " + treeMap.get("Джон Доу"));
    }
}
