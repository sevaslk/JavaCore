package com.sevaslk.javacore.patterns.bridge;

abstract class Feature {
    Type type;

    public Feature(Type type) {
        this.type = type;
    }

    abstract void showType();
}

class Feature1 extends Feature {

    public Feature1(Type type) {
        super(type);
    }

    void showType() {
        System.out.println("feature1");
        type.setType();
    }
}

class Feature2 extends Feature {

    public Feature2(Type type) {
        super(type);
    }

    void showType() {
        System.out.println("feature2");
        type.setType();
    }
}