package com.sevaslk.game;

import java.util.Random;

class ComputerPlayer implements Player {
    @Override
    public StepOptions step() {
        StepOptions[] stepOptions = StepOptions.values();
        StepOptions computerInput = stepOptions[new Random().nextInt(stepOptions.length)];
        System.out.println("Computer choice: " + computerInput);
        return computerInput;
    }
}
