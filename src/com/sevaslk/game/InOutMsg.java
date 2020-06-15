package com.sevaslk.game;

public enum InOutMsg {
    USER_CHOICE("Your choice: "),
    COMPUTER_CHOICE("Computer choice: "),
    USER_WINS("Your wins: "),
    COMPUTER_WINS("Computer wins: "),
    DRAW("Draws: "),
    TIPS_FOR_GAME("Input: '1' for \"Stone\", '2' for \"Scissors\", '3' for \"Paper\"."),
    INVITE_TO_STEP("\"Make your step:\""),
    COMPUTER_WIN("Computer win"),
    YOU_WIN("You win"),
    PLAY_AGAIN("Do you want one more play? Y/N"),
    INVALID_INPUT_MSG("Enter number 1 - 3 or 'q' to exit: ");


    private String msg;

    InOutMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
