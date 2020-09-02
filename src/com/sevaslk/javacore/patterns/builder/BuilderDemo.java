package com.sevaslk.javacore.patterns.builder;

class BuilderDemo {
    public static void main(String[] args) {
        Director director = new Director();
        director.setCarBuilder(new ZAZBuilder());
        Car car = director.buildCar();
        System.out.println(car);
    }
}

class Car {
    String mark;
    Transmission transmission;
    int maxSpeed;

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

