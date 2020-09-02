package com.sevaslk.javacore.patterns.composite;

class CompositeDemo {
    public static void main(String[] args) {
        Node n1 = new Node1();
        Node n2 = new Node2();
        Node n3 = new Node3();

        BoxForNodes b1 = new BoxForNodes();
        BoxForNodes b2 = new BoxForNodes();
        BoxForNodes b3 = new BoxForNodes();

        b1.addNode(n1);
        b1.addNode(n3);

        b2.addNode(b1);
        b2.addNode(n3);
        b2.addNode(n3);

        b2.operation();
    }
}
