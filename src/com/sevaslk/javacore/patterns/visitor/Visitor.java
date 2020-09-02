package com.sevaslk.javacore.patterns.visitor;

interface Visitor {
    void visit(EngineElement engine);

    void visit(BodyElement body);
}

class HooliganVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Started engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Knocked the body");
    }
}

class MechanicVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Checked engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Polished the body");
    }
}

interface Element {
    void accept(Visitor visitor);
}

class EngineElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class BodyElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
