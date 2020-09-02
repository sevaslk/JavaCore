package com.sevaslk.javacore.patterns.abstractfactory;

class WinGUI implements Gui {
    @Override
    public void showGui() {
        System.out.println("Windows GUI");
    }
}
