package com.study.d15;

import java.util.Comparator;
import java.util.stream.Stream;

/*
    小明,170,60
    小華,160,70
    小英,155,40
    1. 按照人名排序
    2. 按照bmi結果排序
*/
public class BMIDemo {
    public static void main(String[] args) {
        BMI b1 = new BMI("小明",170,60);
        BMI b2 = new BMI("小華",160,70);
        BMI b3 = new BMI("小英",155,40);
        
        Stream.of(b1, b2, b3)
                .sorted(Comparator.comparing(BMI::getName))
                .forEach(System.out::println);
        
        Stream.of(b1, b2, b3)
                .sorted()
                .forEach(System.out::println);
        
    }
}
