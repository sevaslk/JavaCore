package com.sevaslk.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

class ChannelExample {
    public static void main(String[] args) throws IOException {
//        demoChannel();
        transferDemo();
    }
    public static void demoChannel() throws IOException {

        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\s\\IdeaProjects\\JavaCore\\src\\com\\sevaslk\\javacore\\chapter13\\German_Gesse_Siddkhartkha.fb2");
             FileOutputStream fileOutputStream = new FileOutputStream("newGerman_Gesse_Siddkhartkha.fb2");
             FileChannel inChannel = fileInputStream.getChannel();
             FileChannel outChannel = fileOutputStream.getChannel()
        ) {
            ByteBuffer inBuffer = ByteBuffer.allocate(4096);
            ByteBuffer outBuffer = ByteBuffer.allocate(4096);

            int r = inChannel.read(inBuffer);
            while (r != -1) {
                inBuffer.flip();
                while (inBuffer.hasRemaining()) {
                    byte get = inBuffer.get();
                    outBuffer.put(get);
                }
                outBuffer.flip();
                outChannel.write(outBuffer);
                inBuffer.clear();
                outBuffer.clear();
                r = inChannel.read(outBuffer);
            }
        }
    }

    public static void transferDemo() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\s\\IdeaProjects\\JavaCore\\src\\com\\sevaslk\\javacore\\chapter13\\German_Gesse_Siddkhartkha.fb2");
             FileOutputStream fileOutputStream = new FileOutputStream("newGerman_Gesse_Siddkhartkha.fb2");
             FileChannel inChannel = fileInputStream.getChannel();
             FileChannel outChannel = fileOutputStream.getChannel()
        ) {
            inChannel.transferTo(0, inChannel.size(), outChannel);

        }
    }

}

