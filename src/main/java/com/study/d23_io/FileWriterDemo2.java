package com.study.d23_io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo2 {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/study/d23_io/MyFile.txt");
        try(FileWriter fw = new FileWriter(file, true); ) {
            fw.write("蔡英文");
        } catch (Exception e) {
        }
        System.out.println("資料寫入完成");
    }
}
