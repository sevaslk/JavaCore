package com.sevaslk.javacore.patterns.abstractfactory;

class WinAppFactory implements AppFactory {
    @Override
    public BootLoader getLoader() {
        return new WinLoader();
    }

    @Override
    public Installer getInstaller() {
        return new WinInstaller();
    }

    @Override
    public Gui getGUI() {
        return new WinGUI();
    }

    @Override
    public Settings getSettings() {
        return new WinSettings();
    }
}
