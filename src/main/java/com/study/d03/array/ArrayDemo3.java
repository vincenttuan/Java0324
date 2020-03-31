package com.study.d03.array;

import java.util.Random;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] lottos = new int[6];
        for(int i=0;i<lottos.length;i++) {
            lottos[i] = new Random().nextInt(9) + 1;
        }
        for(int i=0;i<lottos.length;i++) {
            System.out.print(lottos[i] + ", ");
        }
        System.out.println();
    }
}
