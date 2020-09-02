package com.sevaslk.javacore.patterns.builder;

class Director {
    private CarBuilder carBuilder;
    void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    Car buildCar() {
        carBuilder.createCar();
        carBuilder.buildMark();
        carBuilder.buildTransmission();
        carBuilder.buildMaxSpeed();
        return carBuilder.getCar();
    }
}
