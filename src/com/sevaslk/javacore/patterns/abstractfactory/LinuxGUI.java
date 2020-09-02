package com.sevaslk.javacore.patterns.abstractfactory;

class LinuxGUI implements Gui {
    @Override
    public void showGui() {
        System.out.println("Linux GUI");
    }
}
