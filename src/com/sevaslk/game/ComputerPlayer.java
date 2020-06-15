package com.sevaslk.game;

import java.util.Random;

class ComputerPlayer extends Player {

    @Override
    public int step() {
        return 1 + (new Random().nextInt(3));
    }
}
