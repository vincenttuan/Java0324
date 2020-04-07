package com.study.d05;

public class TryDemo3 {
    public static void main(String[] args) throws Exception {
        calc(10, 0);
    }
    public static void calc(int x, int y) throws Exception {
        int sum = 0;
        if(y == 0) {
            Exception e = new Exception("分母不可為0");
            throw e;
        }
        sum = x / y;
        System.out.printf("sum= %d\n", sum);
    }
}
