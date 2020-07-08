package com.sevaslk.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0) {
            return aStr.compareTo(bStr);
        } else {
            return k;
        }
    }
}

class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> treeMap = new TreeMap<>(new TComp());

        treeMap.put("Джон Доу", 3434.34);
        treeMap.put("Том Смит", 123.22);
        treeMap.put("Джейн Бейкер", 1378.00);
        treeMap.put("Тод Холл", 99.22);
        treeMap.put("Ральф Смит", -19.08);

        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        for (Map.Entry<String, Double> mapEntry : set) {
            System.out.println(mapEntry.getKey() + ":" + mapEntry.getValue());
        }
        System.out.println();

        double balance = treeMap.get("Джон Доу");
        treeMap.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + treeMap.get("Джон Доу"));
    }
}
