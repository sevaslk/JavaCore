package com.sevaslk.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

class WhoIs {
    public static void main(String[] args) {
        int c;
        try (Socket s = new Socket("whois.internic.net", 43)) {
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            String str = (args.length == 0 ? "google.com" : args[0]) + "\n";
            byte[] buf = str.getBytes();
            out.write(buf);
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
