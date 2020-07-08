package com.sevaslk.javacore.chapter18;

import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");
        linkedList.add(1, "A2");
        System.out.println("Исходное содержимое связного списка linkedList: " + linkedList);

        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println(
                "Содержимое связного списка linkedList " +
                        "после удаления элементов: " + linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(
                "Содержимое связного списка linkedList " +
                        "после удаления первого и последнего элементов: " + linkedList);
        String val = linkedList.get(2);
        linkedList.set(2, val + "изменено");
        System.out.println(
                "Содержимое связного списка linkedList после изменения: " + linkedList);

    }

}
