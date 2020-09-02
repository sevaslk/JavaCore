package com.sevaslk.javacore.patterns.chainofresponsibility;

import java.io.LineNumberReader;

abstract class NoteModule {
    NoteModule next;

    abstract void takeMoney(Money money);

    void setNextMoneyModule(NoteModule module) {
        next = module;
    }
}

class NoteModule500 extends NoteModule {

    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt() / Note.UAH500;
        int remind = money.getAmt() % Note.UAH500;
        if (countNote > 0) {
            System.out.println("Выдано " + countNote + " купюр достоинством " + Note.UAH500);
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}

class NoteModule200 extends NoteModule {

    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt() / Note.UAH200;
        int remind = money.getAmt() % Note.UAH200;
        if (countNote > 0) {
            System.out.println("Выдано " + countNote + " купюр достоинством " + Note.UAH200);
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}

class NoteModule100 extends NoteModule {

    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt() / Note.UAH100;
        int remind = money.getAmt() % Note.UAH100;
        if (countNote > 0) {
            System.out.println("Выдано " + countNote + " купюр достоинством " + Note.UAH100);
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
class NoteModule50 extends NoteModule {

    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt() / Note.UAH50;
        int remind = money.getAmt() % Note.UAH50;
        if (countNote > 0) {
            System.out.println("Выдано " + countNote + " купюр достоинством " + Note.UAH50);
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}