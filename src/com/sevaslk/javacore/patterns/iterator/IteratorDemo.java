package com.sevaslk.javacore.patterns.iterator;

class IteratorDemo {
    public static void main(String[] args) {
        ConcreteContainer concreteAggregate = new ConcreteContainer();
        Iterator iterator = concreteAggregate.getIterator();
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
    }
}
