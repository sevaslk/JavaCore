package com.sevaslk.javacore.patterns.state;

interface Station {
    void play();
}

class Radio123 implements Station {

    @Override
    public void play() {
        System.out.println("Radio123...");
    }
}
class Radio567 implements Station {

    @Override
    public void play() {
        System.out.println("Radio567...");
    }
}
class Radio321 implements Station {

    @Override
    public void play() {
        System.out.println("Radio321...");
    }
}
