package com.sevaslk.javacore.patterns.composite;

interface Node {
    void operation();
}

class Node1 implements Node {
    @Override
    public void operation() {
        System.out.println("operation from Item1");
    }
}

class Node2 implements Node {
    @Override
    public void operation() {
        System.out.println("operation from Item2");
    }
}

class Node3 implements Node {
    @Override
    public void operation() {
        System.out.println("operation from Item3");
    }
}

