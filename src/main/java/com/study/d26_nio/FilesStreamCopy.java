package com.study.d26_nio;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesStreamCopy {
    public static void main(String[] args) {
        String url = "http://www.oracle.com/technetwork/java/javadev-15-165770.jpg";
        URI uri = URI.create(url);
        Path dest = Paths.get("src/main/java/com/study/d26_nio/javadev.jpg");
        try(InputStream in = uri.toURL().openStream()) {
            Files.copy(in, dest, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
