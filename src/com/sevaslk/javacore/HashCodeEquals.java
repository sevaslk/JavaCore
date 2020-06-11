package com.sevaslk.javacore;


public class HashCodeEquals {
    public static void main(String[] args) {
        Object object = new Object();
        Object object2 = new Object();
        object.equals(object2);
        System.out.println(object.hashCode());

    }
}
