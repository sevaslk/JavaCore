package com.sevaslk.javacore.chapter13;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

class FileSystemDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("MyDir");
//        file.mkdirs();
        System.out.println(file.isDirectory());

        String[] s = file.list((dir, name) -> name.startsWith("111"));
        for (String t : s) {
            System.out.println(t);
        }
        Path path = Paths.get("test2.txt");
        Stream<String> lines = Files.lines(path);
        lines.forEach(s1 -> System.out.println(s));

    }
}
