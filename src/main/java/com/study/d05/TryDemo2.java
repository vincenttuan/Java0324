package com.study.d05;

public class TryDemo2 {
    public static void main(String[] args) {
        calc(10, 0);
    }
    public static void calc(int x, int y) {
        int sum = 0;
        sum = x / y;
        System.out.printf("sum= %d\n", sum);
    }
}
