package com.sevaslk.javacore.patterns.decorator;

interface PrinterInterface {
    void print();
}

class Printer implements PrinterInterface {
    private String text;

    Printer(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.print(text);
    }
}

abstract class Decorator implements PrinterInterface {
    private PrinterInterface component;

    Decorator(PrinterInterface component) {
        this.component = component;
    }

    public void print() {
        component.print();
    }
}

class QuotesDecorator extends Decorator {
    QuotesDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");

    }
}

class LeftBracketDecorator extends Decorator {
    LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        super.print();

    }
}

class RightBracketDecorator extends Decorator {
    RightBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("]");

    }
}