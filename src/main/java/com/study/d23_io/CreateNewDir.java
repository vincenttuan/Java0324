package com.study.d23_io;

import java.io.File;

public class CreateNewDir {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/java/com/study/d23_io/temps");
        if(!file.exists()) {
            boolean ok = file.mkdir();
            System.out.printf("資料夾建立是否成功 %b\n", ok);
        } else {
            System.out.println("資料夾已存在");
        }
    }
}
