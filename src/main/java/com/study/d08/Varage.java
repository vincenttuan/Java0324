package com.study.d08;

import java.util.stream.IntStream;

public class Varage {
    public static void main(String[] args) {
        int[] values = {100, 90, 80};
        System.out.println("sum: " + calc(values));
        System.out.println("sum: " + calc(10, 20));
        System.out.println("sum: " + calc(10));
        System.out.println("sum: " + calc());
        System.out.println("sum: " + calc(10, 20, 30, 40, 50, 60));
    }
    
    public static int calc(int... values) {
        return IntStream.of(values).sum();
    }
}