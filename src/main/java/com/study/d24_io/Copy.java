package com.study.d24_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Copy {
    public static void main(String[] args) {
        File source = new File("src\\main\\java\\com\\study\\d24_io\\news.txt");
        File dest = new File("src\\main\\java\\com\\study\\d24_io\\news_copy.txt");
        Copy copy = new Copy();
        copy.begin(source, dest);
    }
    
    public void begin(File source, File dest) {
        // 檔案資料暫存區
        List<String> list = new ArrayList<>();
        // 讀取檔案資料
        try(FileReader fr = new FileReader(source);
            BufferedReader br = new BufferedReader(fr);) {
            String line = null;
            while ((line = br.readLine()) != null) {                
                System.out.println("逐行讀取: " + line);
                list.add(line);
            }
        } catch (Exception e) {
        }
        System.out.println(list);
    }
    
}
