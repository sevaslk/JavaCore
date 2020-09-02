package com.sevaslk.javacore.patterns.interpreter;

class InterpreterDemo {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = context.evaluate("1-2+3");
        System.out.println(expression.interpret());
    }
}
