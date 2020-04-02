package com.study.d03.array;

import java.util.stream.IntStream;

public class ArrayDemo7 {
    public static void main(String[] args) {
        int[] scores = {100, 80, 90};
        // 1.1 for-loop
        for(int i=0;i<scores.length;i++) {
            System.out.print(scores[i] + ", ");
        }
        System.out.println();
        // 1.2 for-loop
        for(int i=0, lens=scores.length;i<lens;i++) {
            System.out.print(scores[i] + ", ");
        }
        System.out.println();
        // 2. for-each(in)
        for(int x : scores){
            System.out.print(x + ", ");
        }
        System.out.println();
        // 3.1 Java8 Stream
        IntStream.of(scores).forEach(x -> System.out.print(x + ", "));
        System.out.println();
        // 3.2 Java8 Stream(方法參考 ::)
        IntStream.of(scores).forEach(System.out::println);
    }
}
