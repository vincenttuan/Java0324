package com.study.d21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ShortTask implements Runnable {
    @Override
    public void run() {
        System.out.println("短工作完成");
    }
}

class LongTask implements Runnable {
    @Override
    public void run() {
        System.out.println("長工作開始");
        try {
            // 工作進行中...
            TimeUnit.SECONDS.sleep(5);
        } catch (Exception e) {
        }
        System.out.println("長工作完成");
    }
}

public class ThreadPoolExecutorDemo2 {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newFixedThreadPool(4);
        exec.submit(new ShortTask());
        exec.submit(new ShortTask());
        exec.submit(new LongTask());
        exec.submit(new ShortTask());
        exec.shutdown();
        // 監控執行緒池的運作
        while(!exec.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("仍有工作在執行...");
        }
        System.out.println("所有工作執行完畢");
    }
}
