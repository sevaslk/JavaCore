package com.sevaslk.javacore.patterns.abstractfactory;

class LinuxSettings implements Settings {
    @Override
    public void setSettings() {
        System.out.println("Linux settings");
    }
}
