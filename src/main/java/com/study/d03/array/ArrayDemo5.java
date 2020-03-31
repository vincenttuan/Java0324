package com.study.d03.array;

import java.util.Random;
import java.util.stream.IntStream;
// 使用 Java 8
public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] lottos = new int[6];
        for(int i=0;i<lottos.length;) {
            int n = new Random().nextInt(9) + 1;
            // 確認 n 值是否已存在 lottos 陣列中 ?
            if(!exist(n, lottos)) {
                lottos[i] = n;
                i++;
            } else {
                continue;
            }
        }
        IntStream.of(lottos).forEach(x -> System.out.print(x + ", "));
        System.out.println();
    }
    public static boolean exist(int n, int[] lottos) {
        return IntStream.of(lottos).anyMatch(x -> x == n);
    }
}
