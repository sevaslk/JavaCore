package com.sevaslk.javacore.chapter13;

import java.io.*;

public class FileFirst {
    public static void main(String[] args) throws Exception {
        demoReadWrite();
        demoInputOutput();
        encodeDemo();
    }

    static void demoInputOutput() {
        try (InputStream inputStream = new FileInputStream("C:\\Users\\s\\IdeaProjects\\JavaCore\\src\\com\\sevaslk\\javacore\\chapter13\\test1.txt");
             OutputStream outputStream = new FileOutputStream("C:\\Users\\s\\IdeaProjects\\JavaCore\\src\\com\\sevaslk\\javacore\\chapter13\\test2.txt", true)) {
            byte[] buffer = new byte[4096];
            int r = inputStream.read(buffer);
            while (r != -1) {
                outputStream.write(buffer, 0, r);
                r = inputStream.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void demoReadWrite() throws Exception {
        try (Reader reader = new FileReader("C:\\Users\\s\\IdeaProjects\\JavaCore\\src\\com\\sevaslk\\javacore\\chapter13\\test1.txt");
             Writer writer = new FileWriter("C:\\Users\\s\\IdeaProjects\\JavaCore\\src\\com\\sevaslk\\javacore\\chapter13\\test2.txt")) {

            char[] buffer = new char[4096];
            int c = reader.read(buffer);
            while (c != -1) {
                writer.write(buffer, 0, c);
                c = reader.read(buffer);
            }
        }
    }

    public static void encodeDemo() throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\s\\IdeaProjects\\JavaCore\\src\\com\\sevaslk\\javacore\\chapter13\\German_Gesse_Siddkhartkha.fb2"), "utf-8"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
    }

    public static void demoMemory() throws Exception {

        try (ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            baos.write(null);
        }
    }

    public static void demoMemoryIO() throws IOException {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[10]);
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {

        }
    }
}
