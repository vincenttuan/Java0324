package com.study.d14;

import java.io.File;
import java.util.Scanner;

public class MyStockDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\study\\d14\\BWIBBU_d.csv");
        Scanner sc = new Scanner(file, "UTF-8").useDelimiter("\\A");
        String data = sc.next();
        System.out.println(data);
    }
}
