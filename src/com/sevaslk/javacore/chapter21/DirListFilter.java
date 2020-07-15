package com.sevaslk.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class DirListFilter {
    public static void main(String[] args) {
        String dirName = "MyDir";
        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path filename) {
                if (Files.isWritable(filename)) {
                    return true;
                }
                return false;
            }
        };
        try (DirectoryStream<Path> dirStrm = Files.newDirectoryStream(Paths.get(dirName), how)) {
            System.out.println("Каталог " + dirName);
            for (Path entry : dirStrm) {
                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attribs.isDirectory()) {
                    System.out.println("<DIR> ");
                } else {
                    System.out.println("      ");
                }
                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirName + " не является каталогом.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}


