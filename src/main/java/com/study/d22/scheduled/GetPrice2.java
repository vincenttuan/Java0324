package com.study.d22.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

// 取得金融商品報價
public class GetPrice2 implements Runnable {
    private String symbol; // 商品代號 : 例如 2330.TW

    public GetPrice2(String symbol) {
        this.symbol = symbol;
    }
    
    @Override
    public void run() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String begin = sdf.format(new Date());
            Stock stock = YahooFinance.get(symbol);
            int ms = new Random().nextInt(2000);
            Thread.sleep(ms);
            double price = stock.getQuote().getPrice().doubleValue();
            String name = stock.getName();
            String end = sdf.format(new Date());
            System.out.printf("symbol: %s(%s) price:%.2f 開始時間: %s 查詢時間: %d ms 結束時間: %s\n", symbol, name, price, begin, ms, end);
        } catch (Exception e) {
            
        }
        
        
    }
    
}
