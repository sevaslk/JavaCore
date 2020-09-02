package com.sevaslk.javacore.patterns.abstractfactory;

class LinuxLoader implements BootLoader {

    @Override
    public void load() {
        System.out.println("Linux load");
    }
}
