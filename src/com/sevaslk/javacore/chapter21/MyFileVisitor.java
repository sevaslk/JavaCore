package com.sevaslk.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attributes) throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

class DirTreeList {
    public static void main(String[] args) {
        String dirName = "MyDir";
        System.out.println("Дерево каталогов, начиная с каталога " + dirName + ":\n");
        try {
            Files.walkFileTree(Paths.get(dirName), new MyFileVisitor());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
