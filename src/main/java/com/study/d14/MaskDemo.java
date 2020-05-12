package com.study.d14;

import java.net.URL;
import java.util.Scanner;

public class MaskDemo {
    public static void main(String[] args) throws Exception {
        String path = "https://raw.githubusercontent.com/kiang/pharmacies/master/json/points.json";
        URL url = new URL(path);
        Scanner sc = new Scanner(url.openStream(), "UTF-8").useDelimiter("\\A");
        String json = sc.next();
        System.out.println(json);
    }
}
