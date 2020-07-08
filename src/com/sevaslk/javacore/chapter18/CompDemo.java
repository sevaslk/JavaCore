package com.sevaslk.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        return bStr.compareTo(aStr);
    }
    //equals() переопределять не требуется
}

class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new MyComp());
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
