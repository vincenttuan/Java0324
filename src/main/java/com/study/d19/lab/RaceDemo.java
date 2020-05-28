package com.study.d19.lab;

public class RaceDemo {
    public static void main(String[] args) {
        Runnable r = () -> {
            int step = 1000;
            for(int i=1;true;i++) {
                String threadName = Thread.currentThread().getName();
                System.out.printf("%s 跑了 %d 步\n", threadName, i);
                if(i == step) {
                    System.out.printf("%s 到終點了\n", threadName);
                    break;
                }
            }
        };
        
        Thread t1 = new Thread(r, "烏龜");
        Thread t2 = new Thread(r, "兔子");
        t1.start();
        t2.start();
        
        
        
    }
}
