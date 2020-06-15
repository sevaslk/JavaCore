package com.sevaslk.game;

import java.util.Scanner;

class HumanPlayer extends Player {


    @Override
    public int step() {
        return new Scanner(System.in).nextInt();
    }

    public int step(int a) {
        return a;
    }
}
