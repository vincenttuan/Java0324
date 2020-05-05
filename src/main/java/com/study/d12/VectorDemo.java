package com.study.d12;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for(int i=1;i<=41;i++) {
            v.add(i);
        }
        System.out.println("size: " + v.size()); // 有使用的元素個數
        System.out.println("capacity: " + v.capacity()); // 空間數量
        
    }
}
