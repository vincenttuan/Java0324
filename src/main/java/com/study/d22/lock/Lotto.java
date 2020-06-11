package com.study.d22.lock;

import java.util.Random;

public class Lotto implements Runnable {
    private String name;
    public Lotto(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for(int i=1;i<=5;i++) {
            int n = new Random().nextInt(100);
            System.out.printf("%s 拿第 %d 組的號碼是 : %d\n", name, i, n);
        }
    }
    
}
