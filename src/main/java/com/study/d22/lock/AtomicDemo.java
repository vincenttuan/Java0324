package com.study.d22.lock;

import java.util.concurrent.atomic.AtomicInteger;

class MyInt extends Thread {
    AtomicInteger i = new AtomicInteger();
    @Override
    public void run() {
        while (true) {            
            System.out.println("寫入:" + i.incrementAndGet());
        }
    }
}

public class AtomicDemo {
    public static void main(String[] args) {
        MyInt myInt = new MyInt();
        myInt.start();
        while (true) {            
            System.out.println("讀取:" + myInt.i.get());
        }
    }
}
