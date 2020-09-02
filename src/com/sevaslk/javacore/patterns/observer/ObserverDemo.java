package com.sevaslk.javacore.patterns.observer;

class ObserverDemo {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();
        station.addObserver(new ConsoleObserver());
        station.addObserver(new FileObserver());

        station.setMeasurement(25, 760);
        station.setMeasurement(-10, 755);

    }
}
