package com.sevaslk.javacore.patterns.abstractfactory;

class LinuxInstaller implements Installer {

    @Override
    public void install() {
        System.out.println("Linux install");
    }
}
