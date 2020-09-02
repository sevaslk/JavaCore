package com.sevaslk.javacore.patterns.abstractfactory;

class LinuxAppFactory implements AppFactory {
    @Override
    public BootLoader getLoader() {
        return new LinuxLoader();
    }

    @Override
    public Installer getInstaller() {
        return new LinuxInstaller();
    }

    @Override
    public Gui getGUI() {
        return new LinuxGUI();
    }

    @Override
    public Settings getSettings() {
        return new LinuxSettings();
    }
}
