package com.sevaslk.javacore.patterns.prototype;

class SomethingFactory {
    private Something something;

    SomethingFactory(Something something) {
       setSomething(something);
    }

    void setSomething(Something something) {
        this.something = something;
    }

    Something makeCopy() {
        return (Something) something.copy();
    }
}
