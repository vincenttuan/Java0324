package com.study.d22.single_scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SingleScheduledDemo {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        System.out.println("停 1 秒後執行");
        String symbol = "2330.TW";
        ScheduledFuture<Double> future = exec.schedule(new GetPrice(symbol), 1, TimeUnit.SECONDS);
        double price = future.get();
        System.out.printf("symbol: %s price:%.2f\n", symbol, price);
        exec.shutdown();
    }
}
