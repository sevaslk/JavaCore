package com.sevaslk.javacore.chapter18;

import java.util.HashSet;
import java.util.LinkedHashSet;

class HashSetDemo {
    public static void main(String[] args) {
//        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("Бета");
        hashSet.add("Альфа");
        hashSet.add("Эта");
        hashSet.add("Гамма");
        hashSet.add("Эпсилон");
        hashSet.add("Омега");
        System.out.println(hashSet);
    }
}
