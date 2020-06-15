package com.sevaslk.game;

import java.util.Scanner;

import static com.sevaslk.game.StepOptions.*;
import static com.sevaslk.game.GameStatistic.*;

class GameLogic {
    private Field field = new Field();

    void startGame() {
        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();

        System.out.println(InOutMsg.TIPS_FOR_GAME.getMsg());
        System.out.println(InOutMsg.INVITE_TO_STEP.getMsg());
//        validateInput(getInput());
        field.setFirstPlayerOption(stepHandle(getInput(humanPlayer.step())));
        field.setSecondPlayerOption(stepHandle(computerPlayer.step()));
        checkWinner(field.getFirstPlayerOption(), field.getSecondPlayerOption());
        playAgain();
    }

    private int getInput(int a) {
        return a;
    }

    private String getInput(String s) {
        return s;
    }

    private void validateInput(int humanInput) {
        if (getInput(humanInput) < 1 || getInput(humanInput) > 3) {
            System.out.println(InOutMsg.INVALID_INPUT_MSG.getMsg());
            playAgain();
        }
    }

    private void checkWinner(StepOptions firstPlayerOption, StepOptions secondPlayerOption) {
        if (firstPlayerOption == secondPlayerOption) {
            System.out.println(InOutMsg.DRAW.getMsg());
            setDraws(getDraws() + 1);
        }
        if (STONE.equals(firstPlayerOption)) {
            if (secondPlayerOption.equals(PAPER)) {
                System.out.println(InOutMsg.COMPUTER_WIN.getMsg());
                setComputerWins(getComputerWins() + 1);
            } else if (secondPlayerOption.equals(SCISSORS)) {
                System.out.println(InOutMsg.YOU_WIN.getMsg());
                setUserWins(getUserWins() + 1);
            }
        } else if (SCISSORS.equals(firstPlayerOption)) {
            if (secondPlayerOption.equals(STONE)) {
                System.out.println(InOutMsg.COMPUTER_WIN.getMsg());
                setComputerWins(getComputerWins() + 1);
            } else if (secondPlayerOption.equals(PAPER)) {
                System.out.println(InOutMsg.YOU_WIN.getMsg());
                setUserWins(getUserWins() + 1);
            }
        } else if (PAPER.equals(firstPlayerOption)) {
            if (secondPlayerOption.equals(SCISSORS)) {
                System.out.println(InOutMsg.COMPUTER_WIN.getMsg());
                setComputerWins(getComputerWins() + 1);
            } else if (secondPlayerOption.equals(STONE)) {
                System.out.println(InOutMsg.YOU_WIN.getMsg());
                setUserWins(getUserWins() + 1);
            }
        }
    }

    private void playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(InOutMsg.PLAY_AGAIN.getMsg());
        if ((scanner.nextLine()).toUpperCase().equals("Y")) {
            startGame();
        } else {
            scorePrint();
        }
    }

    private void scorePrint() {
        System.out.println(InOutMsg.USER_WINS.getMsg() + getUserWins());
        System.out.println(InOutMsg.COMPUTER_WINS.getMsg() + getComputerWins());
        System.out.println(InOutMsg.DRAW.getMsg() + getDraws());
    }

    private StepOptions stepHandle(int playerInput) {
        StepOptions result = STONE;
        if (playerInput == 1) {
            System.out.println(InOutMsg.USER_CHOICE.getMsg() + STONE);
            return result;
        } else if (playerInput == 2) {
            System.out.println(InOutMsg.USER_CHOICE.getMsg() + SCISSORS);
            result = SCISSORS;
            return result;
        } else if (playerInput == 3) {
            System.out.println(InOutMsg.USER_CHOICE.getMsg() + PAPER);
            result = PAPER;
            return result;
        } else {
            System.out.println(InOutMsg.INVALID_INPUT_MSG.getMsg());
        }
        return result;
    }
}





