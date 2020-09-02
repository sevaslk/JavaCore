package com.sevaslk.javacore.patterns.chainofresponsibility;

class Money {
    private int amt;

    public Money(int amt) {
        setAmt(amt);
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }
}
