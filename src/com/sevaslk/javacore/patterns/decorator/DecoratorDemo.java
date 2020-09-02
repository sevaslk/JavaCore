package com.sevaslk.javacore.patterns.decorator;

class DecoratorDemo {
    public static void main(String[] args) {
        PrinterInterface printer = new LeftBracketDecorator(new RightBracketDecorator(new QuotesDecorator(new Printer("Hello"))));
        printer.print();
    }
}
