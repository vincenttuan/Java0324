package com.study.d13;

import java.io.File;
import java.util.Scanner;

public class BMIDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\study\\d13\\data\\bmi.csv");
        Scanner sc = new Scanner(file).useDelimiter("\\A");
        String data = sc.next();
        System.out.println(data);
        
    }
}
