package com.sevaslk.javacore.patterns.composite;

import java.util.ArrayList;
import java.util.List;

class BoxForNodes implements Node {
    private List<Node> setNodes = new ArrayList<>();

    void addNode(Node node) {
        setNodes.add(node);
    }

    void removeNode(Node node) {
        setNodes.remove(node);
    }

    @Override
    public void operation() {
        System.out.println("  Inside me:");
        for (Node node : setNodes) {
            node.operation();
        }
    }
}
