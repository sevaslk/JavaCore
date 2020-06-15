package com.sevaslk.game;

import java.util.Random;

class ComputerPlayer extends Player {

    @Override
    public int step() {
//        StepOptions[] stepOptions = StepOptions.values();
//        StepOptions computerInput = stepOptions[new Random().nextInt(stepOptions.length)];
//        System.out.println(InOutMsg.COMPUTER_CHOICE.getMsg() + computerInput);
        return new Random().nextInt(3);
    }
}
