package com.sevaslk.javacore.patterns.chainofresponsibility;

class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        NoteModule note500 = new NoteModule500();
        NoteModule note200 = new NoteModule200();
        NoteModule note100 = new NoteModule100();
        NoteModule note50 = new NoteModule50();

        note500.setNextMoneyModule(note200);
        note200.setNextMoneyModule(note100);
        note100.setNextMoneyModule(note50);

        note500.takeMoney(new Money(8450));
    }
}

