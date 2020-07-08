package com.sevaslk.javacore.chapter18;

import java.util.TreeSet;

class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");
        System.out.println(treeSet);
        System.out.println(treeSet.subSet("C", "F"));
    }
}
