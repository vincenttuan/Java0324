package com.study.d10;

import java.util.function.Function;

public class CircleAreaMain {
    public static void main(String[] args) {
        int [] rs = {10, 9, 8, 7};
        Function<Integer, Double> f = (r) -> r * r * Math.PI;
        print(rs, f);
    }
    
    public static void print(int [] rs, Function<Integer, Double> f) {
        for(int r : rs) {
            System.out.println(f.apply(r));
        }
    }
}
