package com.sevaslk.javacore.patterns.abstractfactory;

class MacAppFactory implements AppFactory {
    @Override
    public BootLoader getLoader() {
        return new MacLoader();
    }

    @Override
    public Installer getInstaller() {
        return new MacInstaller();
    }

    @Override
    public Gui getGUI() {
        return new MacGUI();
    }

    @Override
    public Settings getSettings() {
        return new MacSettings();
    }
}
