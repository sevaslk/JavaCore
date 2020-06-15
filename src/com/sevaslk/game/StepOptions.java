package com.sevaslk.game;

enum StepOptions {
    STONE(1), SCISSORS(2), PAPER(3);
    int id;

    StepOptions(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
