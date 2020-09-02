package com.sevaslk.javacore.patterns.abstractfactory;

class MacInstaller implements Installer {

    @Override
    public void install() {
        System.out.println("MacOS install");
    }
}
