package com.sevaslk.game;

import java.util.Scanner;

class GameLogic {

    void startGame() {
        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();
        System.out.println("Make your step:");
        StepOptions currentUserStep = humanPlayer.step();
        StepOptions currentComputerStep = computerPlayer.step();

        if (currentUserStep == currentComputerStep) {
            System.out.println("Draw");
            Field.draws++;
            playAgain();
        }

        switch (currentUserStep) {
            case STONE:
                if (currentComputerStep == StepOptions.PAPER) {
                    System.out.println("Computer win");
                    Field.computerWins++;
                } else if (currentComputerStep == StepOptions.SCISSORS) {
                    System.out.println("You win");
                    Field.userWins++;
                }
                break;
            case SCISSORS:
                if (currentComputerStep == StepOptions.STONE) {
                    System.out.println("Computer win");
                    Field.computerWins++;
                } else if (currentComputerStep == StepOptions.PAPER) {
                    System.out.println("You win");
                    Field.userWins++;
                }
                break;
            case PAPER:
                if (currentComputerStep == StepOptions.SCISSORS) {
                    System.out.println("Computer win");
                    Field.computerWins++;
                } else if (currentComputerStep == StepOptions.STONE) {
                    System.out.println("You win");
                    Field.userWins++;
                }
                break;
        }
        playAgain();
    }

    private void playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want one more play? Y/N");
        if ((scanner.nextLine()).toUpperCase().equals("Y")) {
            startGame();
        } else {
            Field.scorePrint();
        }
    }
}

