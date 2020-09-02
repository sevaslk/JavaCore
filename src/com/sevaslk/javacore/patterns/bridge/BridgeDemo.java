package com.sevaslk.javacore.patterns.bridge;

class BridgeDemo {
    public static void main(String[] args) {
        Feature feature = new Feature2(new Type2());
        feature.showType();
    }
}
