package com.sevaslk.javacore.patterns.abstractfactory;

class AbstractFactoryDemo {
    public static void main(String[] args) {
        AppFactory factory = getAppFactoryByOS("Win");
        BootLoader loader = factory.getLoader();
        Installer installer = factory.getInstaller();
        Gui gui = factory.getGUI();
        Settings settings = factory.getSettings();

        loader.load();
        installer.install();
        gui.showGui();
        settings.setSettings();
    }

    private static AppFactory getAppFactoryByOS(String osType) {
        switch (osType) {
            case "Win":
                return new WinAppFactory();
            case "Mac":
                return new MacAppFactory();
            case "Linux":
                return new LinuxAppFactory();
            default:
                throw new RuntimeException("Your OS " + osType + " is unsupported.");
        }
    }
}

interface BootLoader {
    void load();
}

interface Installer {
    void install();
}

interface Gui {
    void showGui();
}

interface Settings {
    void setSettings();
}

interface AppFactory {
    BootLoader getLoader();

    Installer getInstaller();

    Gui getGUI();

    Settings getSettings();
}

