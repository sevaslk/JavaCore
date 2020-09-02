package com.sevaslk.javacore.patterns.abstractfactory;

class MacSettings implements Settings {
    @Override
    public void setSettings() {
        System.out.println("MacOS settings");
    }
}
