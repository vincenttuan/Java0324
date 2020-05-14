package com.study.d15;

import java.io.File;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class BMIDemo2 {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\study\\d15\\data.csv");
        Scanner sc = new Scanner(file, "UTF-8").useDelimiter("\\A");
        String data = sc.next();
        System.out.println(data);
    }
}
