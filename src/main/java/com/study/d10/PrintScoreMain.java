package com.study.d10;

import java.util.function.Consumer;

public class PrintScoreMain {
    public static void main(String[] args) {
        int[] scores = {100, 90, 80, 70};
        Consumer<Integer> c1 = (score) -> System.out.println(score);
        Consumer<Integer> c2 = (score) -> System.out.println(score*2);
        Consumer<Integer> c3 = System.out::println;
        print(scores, c1);
        print(scores, c2);
        print(scores, c3);
        print(scores, System.out::println);
    }
    
    public static void print(int [] scores, Consumer<Integer> c) {
        for(int score : scores) {
            c.accept(score);
        }
    }
}
