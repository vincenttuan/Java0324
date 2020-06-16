package com.study.d24_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Copy {
    public static void main(String[] args) {
        File source = new File("src\\main\\java\\com\\study\\d24_io\\news.txt");
        File dest = new File("src\\main\\java\\com\\study\\d24_io\\news_copy.txt");
        Copy copy = new Copy();
        copy.begin(source, dest);
    }
    
    public void begin(File source, File dest) {
        // 檔案資料暫存區
        Queue<String> list = new LinkedList<>();
        // 讀取檔案資料
        try(FileReader fr = new FileReader(source);
            BufferedReader br = new BufferedReader(fr);) {
            String line = null;
            while ((line = br.readLine()) != null) {                
                System.out.println("逐行讀取: " + line);
                list.offer(line);
            }
        } catch (Exception e) {
        }
        System.out.println(list);
        // 逐行寫入
        try(FileWriter fw = new FileWriter(dest);
            BufferedWriter bw = new BufferedWriter(fw, 8*1024);) {
            
            while (!list.isEmpty()) {                
                String line = list.poll(); // 資料取出並移除
                System.out.println("逐行寫入: " + line);
                bw.write(line);
                bw.newLine();
            }
            
        } catch (Exception e) {
        }
        System.out.println("寫入完成");
        System.out.println(list);
    }
    
}
