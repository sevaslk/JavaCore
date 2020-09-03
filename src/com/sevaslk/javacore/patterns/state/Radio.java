package com.sevaslk.javacore.patterns.state;

class Radio {
    private Station station;

    void setStation(Station station) {
        this.station = station;
    }

    void nextStation() {
        if (station instanceof Radio123) {
            setStation(new Radio321());
        } else if (station instanceof Radio321) {
            setStation(new Radio567());
        } else if (station instanceof Radio567) {
            setStation(new Radio123());
        }
    }

    void play() {
        station.play();
    }
}
