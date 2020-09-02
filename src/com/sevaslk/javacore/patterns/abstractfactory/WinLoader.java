package com.sevaslk.javacore.patterns.abstractfactory;

class WinLoader implements BootLoader {

    @Override
    public void load() {
        System.out.println("Windows load");
    }
}
