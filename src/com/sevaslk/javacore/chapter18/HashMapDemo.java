package com.sevaslk.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("Джон Доу", new Double(3434.34));   //зачем здесь боксинг, новый объект в явном виде???
        hashMap.put("Том Смит", 123.22);
        hashMap.put("Джейн Бейкер", 1378.00);
        hashMap.put("Тод Холл", 99.22);
        hashMap.put("Ральф Смит", -19.08);

        Set<Map.Entry<String, Double>> set = hashMap.entrySet();


        for (Map.Entry<String, Double> mEntry : set) {
            System.out.print(mEntry.getKey() + ": ");
            System.out.print(mEntry.getValue());
            System.out.println();
        }

        double balance = hashMap.get("Джон Доу");
        hashMap.put("Джон Доу", balance + 1000);
        System.out.print("Новый остаток на счете Джона Доу: " + hashMap.get("Джон Доу"));
    }

}