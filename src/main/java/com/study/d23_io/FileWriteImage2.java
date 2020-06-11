package com.study.d23_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileWriteImage2 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://i.ytimg.com/vi/7PXLPzcIydw/maxresdefault.jpg");
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestProperty("User-Agent", "Chrome");
        File file = new File("src/main/java/com/study/d23_io/car.jpg");
        try(InputStream is = con.getInputStream();
            FileOutputStream fos = new FileOutputStream(file);) {
            
            int data;
            while((data = is.read()) != -1) {
                fos.write(data);
            }
            System.out.println("影像寫入完畢");
        } catch (Exception e) {
        }
    }
}
