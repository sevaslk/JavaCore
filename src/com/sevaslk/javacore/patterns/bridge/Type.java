package com.sevaslk.javacore.patterns.bridge;

interface Type {
    void setType();
}

class Type1 implements Type {
    @Override
    public void setType() {
        System.out.println("Type1");
    }
}

class Type2 implements Type {
    @Override
    public void setType() {
        System.out.println("Type2");
    }
}
