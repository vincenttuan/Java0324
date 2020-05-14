package com.study.d15;

import java.util.stream.Stream;

public class MyStockDemo {
    public static void main(String[] args) {
        MyStock m1 = new MyStock("2330.TW", 5000, 300); // 台積電
        MyStock m2 = new MyStock("2303.TW", 8000, 20); // 聯電
        MyStock m3 = new MyStock("2317.TW", 9000, 100); // 鴻海
        // 根據 symbol 進行排序
        Stream.of(m1, m2, m3).sorted().forEach(System.out::println);
    }
}
