package com.sevaslk.javacore.chapter13;

import java.applet.Applet;
import java.awt.*;
/*
<applet code="SimpleApplet" width=200 height=60>
</appllet>
*/

public class SimpleApplet extends Applet {
    public void paint(Graphics q) {
        q.drawString("Простейший апплет", 20, 20);
    }
}
