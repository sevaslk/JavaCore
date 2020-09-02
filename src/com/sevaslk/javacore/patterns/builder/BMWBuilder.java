package com.sevaslk.javacore.patterns.builder;

class BMWBuilder extends CarBuilder {

    @Override
    void buildMark() {
        car.setMark("BMW");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(250);
    }
}
