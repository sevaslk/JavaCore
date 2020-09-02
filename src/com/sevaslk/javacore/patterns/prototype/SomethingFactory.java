package com.sevaslk.javacore.patterns.prototype;

class SomethingFactory {
    Something something;

    public SomethingFactory(Something something) {
       setSomething(something);
    }

    public void setSomething(Something something) {
        this.something = something;
    }

    Something makeCopy() {
        return (Something) something.copy();
    }
}
