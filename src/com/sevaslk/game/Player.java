package com.sevaslk.game;

abstract class Player {

    Type playerType;
    String name = "";

    abstract int step();

}

enum Type {
    HUMAN, COMPUTER
}
