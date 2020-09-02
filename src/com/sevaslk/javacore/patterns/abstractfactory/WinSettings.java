package com.sevaslk.javacore.patterns.abstractfactory;

class WinSettings implements Settings {
    @Override
    public void setSettings() {
        System.out.println("Windows settings");
    }
}
