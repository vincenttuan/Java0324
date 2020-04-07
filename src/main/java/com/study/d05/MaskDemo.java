package com.study.d05;

import java.io.File;
import java.util.Scanner;

public class MaskDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\study\\d05\\mask.json");
        String json = getJson(file);
        System.out.println(json);
    }
    // 取得 Json 字串
    public static String getJson(File file) throws Exception {
        Scanner sc = new Scanner(file, "UTF-8").useDelimiter("\\A");
        return sc.next();
    }
    
}
