package com.sevaslk.javacore.patterns.factorymethod;

interface Alcohol {
    void drink();
}

class Vodka implements Alcohol {
    public void drink() {
        System.out.println("Vodka");
    }
}

class Rom implements Alcohol {
    public void drink() {
        System.out.println("Rom");
    }
}

class Samogon implements Alcohol {
    public void drink() {
        System.out.println("Samogon");
    }
}