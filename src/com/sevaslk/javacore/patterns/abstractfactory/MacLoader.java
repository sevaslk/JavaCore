package com.sevaslk.javacore.patterns.abstractfactory;

class MacLoader implements BootLoader {

    @Override
    public void load() {
        System.out.println("MacOS load");
    }
}
