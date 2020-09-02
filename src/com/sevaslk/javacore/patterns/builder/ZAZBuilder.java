package com.sevaslk.javacore.patterns.builder;

class ZAZBuilder extends CarBuilder {

    @Override
    void buildMark() {
        car.setMark("ZAZ");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(100);
    }
}
