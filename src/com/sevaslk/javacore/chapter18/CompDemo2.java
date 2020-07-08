package com.sevaslk.javacore.chapter18;

import java.util.TreeSet;

class CompDemo2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));

        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");
        for (String element : treeSet) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
