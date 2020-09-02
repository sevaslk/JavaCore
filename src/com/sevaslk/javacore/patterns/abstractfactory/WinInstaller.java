package com.sevaslk.javacore.patterns.abstractfactory;

class WinInstaller implements Installer {

    @Override
    public void install() {
        System.out.println("Windows install");
    }
}
