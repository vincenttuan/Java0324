package com.study.d24_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class BMIWriteToFile {
    public static void main(String[] args) {
        // 基本資料
        String userName = "mary";
        double h = 160;
        double w = 60;
        // 建立 BMI 物件並計算 bmi 值
        BMI bmi = new BMI(h, w);
        double bmiValue = w / Math.pow(h/100, 2);
        bmi.setBmi(bmiValue);
        // 寫入序列化檔案
        File file = new File("src/main/java/com/study/d24_io/" + userName + ".bin");
        try(FileOutputStream fis = new FileOutputStream(file); 
            ObjectOutputStream oos = new ObjectOutputStream(fis)) {
            oos.writeObject(bmi);
            System.out.println(file + " 寫入成功");
        } catch (Exception e) {
        }
        
        
        
    }
}
