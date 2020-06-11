package com.study.d23_io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/study/d23_io/MyFile.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file, true); // true 不清空原資料, false 清空原資料
            fw.write("ABC");
        } catch (Exception e) {
        } finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
