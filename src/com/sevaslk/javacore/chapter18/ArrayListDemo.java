package com.sevaslk.javacore.chapter18;

import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.ensureCapacity(10);
        arrayList.trimToSize();

        System.out.println("Начальный размер списочного массива arrayList: " + arrayList.size());
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add(1, "A2");
        System.out.println("Размер списочного массива arrayList после ввода элементов: " + arrayList.size());
        System.out.println("Содержимое списочного массива arrayList: " + arrayList);
        arrayList.remove("F");
        arrayList.remove(2);
        System.out.println("Размер списочного массива arrayList после удаления элементов: " + arrayList.size());
        System.out.println("Содержимое списочного массива arrayList: " + arrayList);
    }
}
