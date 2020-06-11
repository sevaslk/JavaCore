package com.sevaslk.game;

import java.util.Scanner;

class HumanPlayer implements Player {
    static {
        System.out.println("Input: ");
        System.out.println(" '1' for \"Rock\"");
        System.out.println(" '2' for \"Scissors\"");
        System.out.println(" '3' for \"Paper\"");
    }

    @Override
    public StepOptions step() {
        Scanner scanner = new Scanner(System.in);
        int humanInput = scanner.nextInt();

        if (humanInput < 1 || humanInput > 3) {
            System.out.println("Enter number 1 - 3: ");
        }

        if (humanInput == 1) {
            System.out.println("Your choice: " + StepOptions.STONE);
            return StepOptions.STONE;
        } else if (humanInput == 2) {
            System.out.println("Your choice: " + StepOptions.SCISSORS);
            return StepOptions.SCISSORS;
        } else if (humanInput == 3) {
            System.out.println("Your choice: " + StepOptions.PAPER);
            return StepOptions.PAPER;
        } else {
            return step();
        }
    }
}
