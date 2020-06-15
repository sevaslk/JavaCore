package com.sevaslk.game;

class Field {
    private StepOptions firstPlayerOption;
    private StepOptions secondPlayerOption;

    public void setFirstPlayerOption(StepOptions firstPlayerOption) {
        this.firstPlayerOption = firstPlayerOption;
    }

    public void setSecondPlayerOption(StepOptions secondPlayerOption) {
        this.secondPlayerOption = secondPlayerOption;
    }

    public StepOptions getFirstPlayerOption() {
        return firstPlayerOption;
    }

    public StepOptions getSecondPlayerOption() {
        return secondPlayerOption;
    }

}
