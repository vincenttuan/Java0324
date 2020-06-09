package com.study.d22.scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class FixdDelayScheduledDemo {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        System.out.println("停 1 秒後執行");
        String symbol = "2330.TW";
        exec.scheduleWithFixedDelay(new GetPrice2(symbol), 1, 2, TimeUnit.SECONDS);
        //exec.shutdown();
    }
}
