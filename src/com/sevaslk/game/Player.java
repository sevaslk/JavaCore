package com.sevaslk.game;

enum Type {
    HUMAN, COMPUTER
}

abstract class Player {
    Type playerType;
    String name = "";

    abstract int step();
}

