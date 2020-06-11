package com.study.d23_io;

class Bar implements AutoCloseable {
    public Bar() {
        System.out.println("Bar 建立");
    }
    public void play() {
        System.out.println("Bar 執行...");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Bar 關閉");
    }
}

public class AutoCloseableDemo {
    
}
