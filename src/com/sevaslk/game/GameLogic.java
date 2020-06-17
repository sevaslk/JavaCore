package com.sevaslk.game;

import java.util.InputMismatchException;

import static com.sevaslk.game.GameStatistic.*;
import static com.sevaslk.game.InOutMsg.*;
import static com.sevaslk.game.StepOptions.*;

class GameLogic {
    private Field field;
    private HumanPlayer humanPlayer;
    private ComputerPlayer computerPlayer;

    GameLogic() {
        field = new Field();
        humanPlayer = new HumanPlayer();
        computerPlayer = new ComputerPlayer();
    }

    void startGame() {

        try {
            System.out.println(TIPS_FOR_GAME.getMsg());
            System.out.println(INVITE_TO_STEP.getMsg());

            field.setFirstPlayerOption(stepHandle(getInput(validateInput(humanPlayer.step()))));
            System.out.println(USER_CHOICE.getMsg() + field.getFirstPlayerOption());

            field.setSecondPlayerOption(stepHandle(getInput(computerPlayer.step())));
            System.out.println(COMPUTER_CHOICE.getMsg() + field.getSecondPlayerOption());

            System.out.println(resultCalculation(field.getFirstPlayerOption(), field.getSecondPlayerOption()));
        } catch (IllegalArgumentException | NullPointerException | InputMismatchException e) {
            System.out.println(EXC_MSG.getMsg());
        }
        startGame();
    }

    private int getInput(int a) {
        return a;
    }

    private int validateInput(int humanInput) {
        if (getInput(humanInput) < 0 || getInput(humanInput) > 3) {
            System.out.println(INVALID_INPUT_MSG.getMsg());
            startGame();
        }
        if (getInput(humanInput) == 0) {
            scorePrint();
            checkWinner();
            System.exit(0);
        }
        return getInput(humanInput);
    }

    private void checkWinner() {
        if (GameStatistic.getUserWins() > GameStatistic.getComputerWins()) {
            System.out.println(USER_WON.getMsg());
        }
        if (GameStatistic.getUserWins() < GameStatistic.getComputerWins()) {
            System.out.println(COMPUTER_WON.getMsg());
        } else {
            System.out.println(DRAW_WON.getMsg());
        }
    }

    private String resultCalculation(StepOptions firstPlayerOption, StepOptions secondPlayerOption) {
        if (firstPlayerOption == secondPlayerOption) {
            setDraws(getDraws() + 1);
            return DRAW.getMsg();
        }
        if ((firstPlayerOption.equals(STONE)) && (secondPlayerOption.equals(PAPER))
                || (firstPlayerOption.equals(SCISSORS)) && (secondPlayerOption.equals(STONE))
                || (firstPlayerOption.equals(PAPER)) && (secondPlayerOption.equals(SCISSORS))) {
            setComputerWins(getComputerWins() + 1);
            return COMPUTER_WIN.getMsg();
        } else {
            setUserWins(getUserWins() + 1);
            return YOU_WIN.getMsg();
        }
    }

    private void scorePrint() {
        System.out.println(USER_WINS.getMsg() + getUserWins());
        System.out.println(COMPUTER_WINS.getMsg() + getComputerWins());
        System.out.println(DRAW.getMsg() + getDraws());
    }

    private StepOptions stepHandle(int playerInput) throws IllegalArgumentException, NullPointerException {
        for (StepOptions stepOptions : StepOptions.values()) {
            if (playerInput == stepOptions.getId()) {
                return stepOptions;
            }
        }
        return null;
    }
}






