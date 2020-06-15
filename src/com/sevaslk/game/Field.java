package com.sevaslk.game;

class Field {
    private StepOptions firstPlayerOption;
    private StepOptions secondPlayerOption;

    void setFirstPlayerOption(StepOptions firstPlayerOption) {
        this.firstPlayerOption = firstPlayerOption;
    }

    void setSecondPlayerOption(StepOptions secondPlayerOption) {
        this.secondPlayerOption = secondPlayerOption;
    }

    StepOptions getFirstPlayerOption() {
        return firstPlayerOption;
    }

    StepOptions getSecondPlayerOption() {
        return secondPlayerOption;
    }
}
