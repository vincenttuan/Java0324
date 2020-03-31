package com.study.d03.array;

import java.util.Random;

public class ArrayDemo4 {
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
        for(int i=0;i<lottos.length;i++) {
            System.out.print(lottos[i] + ", ");
        }
        System.out.println();
    }
    public static boolean exist(int n, int[] lottos) {
        boolean flag = false;
        for(int i=0;i<lottos.length;i++) {
            if(lottos[i] == n) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
