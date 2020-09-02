package com.sevaslk.javacore.patterns.state;

class StateDemo {
    public static void main(String[] args) {
        Station radio123 = new Radio123();
        Radio radio = new Radio();
        radio.setStation(radio123);

        for (int i = 0; i < 10; i++) {
            radio.play();
            radio.nextStation();
        }
    }
}
