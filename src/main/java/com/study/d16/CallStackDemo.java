package com.study.d16;

public class CallStackDemo {
    public static void main(String[] args) {
        int y = 0;
        foo(y);
    }
    
    public static void foo(int y) {
        try {
            bar(y);
        } catch (Exception e) {
            System.out.println("foo() 處理了, " + e.getMessage());
        }
    }
    
    public static void bar(int y) {
        System.out.println(500/y);
    }
    
}
