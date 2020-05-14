package com.study.d15;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class BMIDemo2 {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\study\\d15\\data.csv");
        Scanner sc = new Scanner(file, "UTF-8").useDelimiter("\\A");
        String data = sc.next();
        System.out.println(data);
        String[] rows = data.split("\n");
        
        List<BMI> list = new ArrayList<>();
        for(String row : rows) {
            // 小明,170,60
            String[] rowArray = row.split(",");
            String name = rowArray[0].trim();
            double height = Double.parseDouble(rowArray[1].trim());
            double weight = Double.parseDouble(rowArray[2].trim());
            BMI bmi = new BMI(name, height, weight);
            list.add(bmi);
        }
        System.out.println(list);
        
        list.stream()
                .sorted(Comparator.comparing(BMI::getName))
                .forEach(System.out::println);
        
        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
